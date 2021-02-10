package Practica.Practicum1.Opdracht1;

public class Main {

    public static void main(String[] args) {

        // For loop
        for(int i=1; i<11; i++){
            System.out.println("Getal is : " + i);
        }

        // Enhanced for loop
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Enhanced getal is : " + item);
        }

    }

}
