package esercizi7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esercizi7 {

    public static List<String> mySort(List<String> elenco) {
        Collections.sort(elenco);
        return elenco;
    }

    public static List<Persona> mySortPersona(List<Persona> elenco) {
        Collections.sort(elenco);
        return elenco;
    }

    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Luca");
        nomi.add("Giulia");
        nomi.add("Andrea");
        nomi.add("Fabio");
        mySort(nomi);
        System.out.println(nomi);

        List<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Luca", "Rossi", 1990));
        persone.add(new Persona("Giulia", "Rossi", 1990));
        persone.add(new Persona("Andrea", "Bianchi", 1990));
        persone.add(new Persona("Fabio", "Verdi", 1990));
        mySortPersona(persone);

        for (Persona p : persone) {
            System.out.println(p.getCognome() + " " + p.getNome());
        }

        List<String> stringhe = new ArrayList<>();
        stringhe.add("Luca");
        stringhe.add("Giulia");
        stringhe.add("Andrea");
        stringhe.add("Fabio");

        File file = new File("info.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fout);

            for (String s : stringhe) {
                pw.write(s + "\n");

            }

            pw.close();
            fout.close();

        } catch (IOException e) {
            System.err.println("Error while writing to file");
            e.printStackTrace();
        }

        file = new File("info-inlinea.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fout);

            StringBuilder sb = new StringBuilder();
            for (String s : stringhe) {
                sb.append(s).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length() - 1);

            pw.write(sb.toString());
            pw.close();
            fout.close();

        } catch (IOException e) {
            System.err.println("Error while writing to file");
            e.printStackTrace();
        }

    }
}
