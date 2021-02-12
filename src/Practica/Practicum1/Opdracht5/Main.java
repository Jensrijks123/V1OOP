package Practica.Practicum1.Opdracht5;

public class Main {

    public static void main(String[] arg){
        Integer zaagtand = 2;
        String letterS = "s";
        String lettersSS = "ss";

        // For loop met een If statement
        for(int i=1; i<6; i++){
            if ((zaagtand % 2) == 0)
            {
                System.out.println(letterS);
                zaagtand++;
            }
            else
            {
                System.out.println(lettersSS);
                zaagtand++;
            }
        }
    }
}
