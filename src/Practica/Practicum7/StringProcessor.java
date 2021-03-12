package Practica.Practicum7;


import java.util.ArrayList;

public class StringProcessor {

    private ArrayList<OpmaakProces> Processen= new ArrayList<>();

    public StringProcessor() {
    }

    public String verwerk(String input) {
        String s = Processen.get(0).maakOp(input);

        for(int i = 1; i != Processen.size(); i++){
            s = Processen.get(i).maakOp(s);
        }

        return s;
    }

    public void voegProcesToe(OpmaakProces proces) {
        Processen.add(proces);
    }

}
