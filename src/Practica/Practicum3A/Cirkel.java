package Practica.Practicum3A;

public class Cirkel {

    private Integer radius;
    private Integer xPositie;
    private Integer yPositie;

    public Cirkel(Integer rad, Integer x, Integer y) {
        radius = rad;
        xPositie = x;
        yPositie = y;
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }

    }

    public String toString() {
        String c = "cirkel " + "(" + xPositie + ", " + yPositie + ") met radius: " + radius;
        return c;
    }

}
