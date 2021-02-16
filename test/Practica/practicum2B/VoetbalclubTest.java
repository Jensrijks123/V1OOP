package Practica.practicum2B;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    // Eis 1
    @Test
    void voetbalclubNaam (){
        Voetbalclub ajx = new Voetbalclub("");
        assertSame( "FC",  "Ajax");
    }
    // Eis 2
    @Test
    void beinvloedenPuntenGewonnen () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');

        assertEquals(3, feij.aantalPunten());
    }

    @Test
    void beinvloedenPuntenGelijk () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('g');

        assertEquals(1, feij.aantalPunten());
    }

    @Test
    void beinvloedenPuntenVerloren () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('v');

        assertEquals(0, feij.aantalPunten());
    }
    // Eis 3
    @Test
    void puntenGelijk () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        assertEquals(4, feij.aantalGespeeld());
    }

    @Test
    void toStringUittesten () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        assertEquals("Feijenoord 4 3 1 0 10", feij.toString());
    }
    // Eis 4
    @Test

    void verhaaldelijkVerwerken () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        feij.verwerkResultaat('i');
        feij.verwerkResultaat('9');

        assertEquals(8, feij.aantalGespeeld());
        assertEquals(20, feij.aantalPunten());

    }
}