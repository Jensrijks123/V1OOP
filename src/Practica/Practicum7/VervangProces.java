package Practica.Practicum7;

public class VervangProces implements OpmaakProces {

    private String oud;
    private String nieuw;

    public VervangProces(String ou, String ni) {
        oud = ou;
        nieuw = ni;
    }

    public String maakOp(String input) {
        String s = "";

        if (oud != nieuw) {
            s = s + input.replaceAll(oud, nieuw);
        }

        return s;

    }

}
