package Practica.Practicum6A;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return 10.50;
    }

    public boolean equals(Object andereObject) {
        return true;
    }

    @Override
    public String toString() {
        return "Game{" +
                "naam='" + naam + '\'' +
                ", releaseJaar=" + releaseJaar +
                ", nieuwprijs=" + nieuwprijs +
                '}';
    }
}
