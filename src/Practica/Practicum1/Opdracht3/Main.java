package Practica.Practicum1.Opdracht3;

public class Main {

    public static void main(String[] arg){
        int min = 0;
        int max = 10;
        int count = 1;

        // While loop
        while (count < 11) {

            // Random numbers
            int random_int = (int)(Math.random() * (max - min + 1) + min);

            // Random number 0.0 to 1.0
            double random_double = Math.random();

            System.out.println("Random numbers : ");
            System.out.println(random_int);
            System.out.println("and");
            System.out.println(Math.round(random_double * 10) / 10.0);

            count++;
        }



    }

}
