package esercizi1;

public class Esercizi1 {

    public static void main(String[] args) {
        // Esercizio 1
        boolean veroFalso = true;
        char carattere = 'z';

        float decimaleF = 1.5f;
        double decimaleD = 4.3;

        byte numeroPiccolissimo = 100;
        short numeroPiccolo = 20000;
        int numeroClassico = 200000;
        long numeroEsagerato = 1000000;

        // Esercizio 2
        int x = 5;
        int y = 7;
        if (x < y) {
            System.out.println("x è minore di y");
        } else {
            System.out.println("y è minore di x");
        }


        // Esercizio 3
        for (int numero = 1; numero < 101; numero++) {
            System.out.println(numero);
        }
        {
            int numero = 100;
            while (numero > 0) {
                System.out.println(numero);
                numero -= 1;
            }
        }

        // Esercizio 4
        double[] valori = {1, 1.4, 8.7, 5, 3.4, 2.2, 7, 8, 9, 4.5, 11, 4.6, 7.9};
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] < 5) {
                System.out.println(valori[i]);
            }
        }

        for (double value : valori) {
            if (value < 5) {
                System.out.println(value);
            }
        }

        {
            // Esercizio 5
            int numero = 8;
            int fattoriale = 1;
            while (numero > 0) {
                fattoriale *= numero;
                numero -= 1;
            }
            System.out.println(fattoriale);
        }

        // Esercizio 6
        for (int numero = 0; numero < 200; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }


}
