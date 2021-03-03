package Practica.practicum2B;

public class Voetbalclub {

    private String club;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;
    private int puntenBijWinnen = 3;

    public Voetbalclub(String club) {
        this.club = club;
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
        Integer p = (aantalGewonnen * 3) + aantalGelijk;
        return p;
    }

    public Integer aantalGespeeld() {
        Integer g = aantalGewonnen + aantalGelijk + aantalVerloren;
        return g;
    }

    public String toString() {
        String s = club + " " + (aantalGewonnen + aantalGelijk + aantalVerloren) + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + ((aantalGewonnen * puntenBijWinnen) + (aantalGelijk) + (aantalVerloren));
        return s;
    }

}
