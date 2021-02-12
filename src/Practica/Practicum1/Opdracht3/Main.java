package Practica.Practicum1.Opdracht3;

public class Main {

    public static void main(String[] arg){
        int min = 0;
        int max = 10;
        int count = 1;

        // While loop
        while (count < 11) {

            // Random numbers
            int randomInt = (int)(Math.random() * (max - min + 1) + min);

            // Random number 0.0 to 1.0
            double randomDouble = Math.random();

            System.out.println("Random numbers : ");
            System.out.println(randomInt);
            System.out.println("and");
            System.out.println(Math.round(randomDouble * 10) / 10.0);

            count++;
        }



    }

}
