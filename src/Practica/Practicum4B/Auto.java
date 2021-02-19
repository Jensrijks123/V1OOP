package Practica.Practicum4B;

public class Auto {

    private String type;
    private double prijsPerDag = 1.1;

    public Auto(String tp, double prPd) {
        type = tp;
        prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        String s = type + " met prijs per dag: " + prijsPerDag;
        return s;
    }
}
