package Practica.Practicum4B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class AutoHuurTest {

    @Test
    void huurderMetKortingPrijs () {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        Auto a1 = new Auto("Ferrari", 3500);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3150.0, ah1.totaalPrijs());
    }

    @Test
    void huurderZonderKortingPrijs () {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(0.0);
        ah1.setHuurder(k);
        Auto a1 = new Auto("Ferrari", 3500);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3500.0, ah1.totaalPrijs());

    }

    @Test
    void geenHuurderGeenAuto() {
        AutoHuur ah1 = new AutoHuur();

        assertEquals(0, ah1.totaalPrijs());


    }

    @Test
    void geenHuurderWelAuto() {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("");
        k.setKorting(0.0);
        ah1.setHuurder(k);
        Auto a1 = new Auto("Ferrari", 3500);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(3500.0, ah1.totaalPrijs());
    }

    @Test
    void welHuurderGeenAuto() {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("");
        k.setKorting(0.0);
        ah1.setHuurder(k);
        ah1.setAantalDagen(1);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void geenPrijsPerDag() {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        Auto a1 = new Auto("Ferrari", 0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);

        assertEquals(0.0, ah1.totaalPrijs());
    }

}