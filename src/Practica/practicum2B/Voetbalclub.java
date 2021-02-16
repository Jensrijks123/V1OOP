package Practica.practicum2B;

public class Voetbalclub {

    private String club;
    private Integer aantalGewonnen = 0;
    private Integer aantalGelijk = 0;
    private Integer aantalVerloren = 0;
    private Integer puntenBijWinnen = 3;

    public Voetbalclub(String cl) {
        club = cl;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public Integer aantalPunten() {
        Integer p = (aantalGewonnen * puntenBijWinnen) + (aantalGelijk);
        return p;
    }

    public Integer aantalGespeeld() {
        Integer g = aantalGewonnen + aantalGelijk + aantalVerloren;
        return g;
    }

    public String toString() {
        String a = club + " " + (aantalGewonnen + aantalGelijk + aantalVerloren) + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + ((aantalGewonnen * puntenBijWinnen) + (aantalGelijk) + (aantalVerloren));
        return a;
    }


}
