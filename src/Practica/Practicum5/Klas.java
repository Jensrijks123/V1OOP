package Practica.Practicum5;

import java.util.ArrayList;

public class Klas {

    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    public Klas(String kC) {
        klasCode = kC;
        deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, Double nweCijfer) {

        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam() == nm) {
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        int i = deLeerlingen.size();
        return i;
    }

    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:\n";

        for (int i = 0; i < 3; i++) {
            s = s + deLeerlingen.get(i) + "\n";
        }

        return s;
    }
}
