package prove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dimostrazioni {

    public static void main(String[] args) {
        int[] values = new int[3];
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4; // Errore (Eccezione)

        // Nessuna dimensione prestabilita
        List<Integer> elenco = new ArrayList<>();
        elenco.add(1);
        elenco.add(2);
        elenco.add(3);
        // Avanti anche all'infinito


        Collections.sort(elenco);

        Integer[] valori = {1, 2, 3, 4, 5, 6};
        List<Integer> lista = Arrays.asList(valori);


        System.out.println(elenco.get(0));

        System.out.println(values[2]);
    }
}
