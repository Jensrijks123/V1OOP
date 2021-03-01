package Practica.Practicum3B;

public class Main {

    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        // Try-catch blok
        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        // Zonder try-catch blok
//        c1 = new Cirkel(10, 0, 0);
//        c2 = new Cirkel(0, 10, 10);

        // Zonder het try-catch blok volgt er een foutmelding als je de code runt, omdat de fout nergens wordt opepakt

        System.out.println(c1);
        System.out.println(c2);
    }
}
