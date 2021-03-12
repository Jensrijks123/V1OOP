package Practica.Practicum7;


public class KleurProces implements OpmaakProces{

    private static final String RED_BOLD_BRIGHT = "\033[1;91m";


    public KleurProces() {

    }

    public String maakOp(String input) {

        input =  RED_BOLD_BRIGHT + input;

        return input;
    }



}

