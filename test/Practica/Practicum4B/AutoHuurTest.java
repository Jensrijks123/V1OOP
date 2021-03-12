package Practica.Practicum4B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AutoHuurTest {

    private Klant k;
    private AutoHuur ah1;
    private Auto a1;


    @BeforeEach
    void asdad () {
        k = new Klant("Mijnheer de Vries");
        a1 = new Auto("Ferrari", 3500);
        ah1 = new AutoHuur();
    }

    @Test
    void huurderMetKortingPrijs () {
        k.setKorting(10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3150.0, ah1.totaalPrijs());
    }

    @Test
    void huurderZonderKortingPrijs () {
        k.setKorting(0.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3500.0, ah1.totaalPrijs());

    }

    @Test
    void geenHuurderGeenAuto() {

        assertEquals(0, ah1.totaalPrijs());
    }

    @Test
    void geenHuurderWelAuto() {
        Klant k = new Klant("");
        k.setKorting(0.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3500.0, ah1.totaalPrijs());
    }

    @Test
    void welHuurderGeenAuto() {
        Klant k = new Klant("");
        k.setKorting(0.0);
        ah1.setHuurder(k);
        ah1.setAantalDagen(1);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void geenPrijsPerDag() {
        k.setKorting(10.0);
        ah1.setHuurder(k);
        Auto a1 = new Auto("Ferrari", 0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void negativeKorting() {
        k.setKorting(-10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3850, ah1.totaalPrijs());
    }

    @Test
    void stringInInteger() {
        k.setKorting(-10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3850, ah1.totaalPrijs());
    }

}