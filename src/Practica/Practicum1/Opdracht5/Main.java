package Practica.Practicum1.Opdracht5;

public class Main {

    public static void main(String[] arg){

        // For loop met if statement
        String[] numbers = {"s", "ss"};
        for (String item : numbers) {
            System.out.println(item);
            if (item == "ss")
                System.out.println("s" + "\nss");
        }

    }
}
