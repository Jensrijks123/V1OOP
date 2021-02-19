package Practica.Practicum4B;

public class Klant {

    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public void setKorting(double kP) { kortingsPercentage = kP; }

    public double getKorting() { return kortingsPercentage; }

    public String toString() {
        String s = "  op de naam van: " + naam + " (korting: " + kortingsPercentage + "%) \n";
        return s;
    }
}
