package esercizi6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esercizi6 {

    public static int getMax(List<Integer> numeri) {
        int massimoCorrente = numeri.get(0);
        for (int n : numeri) {
            if (n > massimoCorrente) {
                massimoCorrente = n;
            }
        }
        return massimoCorrente;

        // Altrimenti
//        Collections.sort(numeri);
//        return numeri.get(numeri.size() - 1);
    }

    public static void main(String[] args) {

        // Esercizio Funzioni 1
        List<String> elenco = new ArrayList<>();
        elenco.add("Marco");
        elenco.add("Luca");
        elenco.add("Fabio");
        elenco.add("Giulia");
        elenco.add("Federica");

        for (int i = 0; i < elenco.size(); i++) {
            System.out.println(elenco.get(i));
        }

        for (String nome : elenco) {
            System.out.println(nome);
        }

        // Esercizio Funzioni 2
        List<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);
        numeri.add(100);
        numeri.add(6);
        numeri.add(7);
        numeri.add(8);
        numeri.add(9);
        numeri.add(10);


        // Esercizio Funzioni 3
        int massimo = getMax(numeri);
        System.out.println(massimo);

    }
}
