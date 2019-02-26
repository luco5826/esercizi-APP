package esercizi5;

public class Esercizi5 {

    public static double calcolaNuovoPrezzo(double prezzoIniziale, int scontoApplicato) {
        if (prezzoIniziale < 0 || scontoApplicato < 0 || scontoApplicato > 100) {
            throw new IllegalArgumentException("Il prezzo non può essere negativo e lo sconto deve essere compreso tra 0 e 100");
        }
        double fattoreDiSconto = (100 - scontoApplicato) / 100.0;

        return prezzoIniziale * fattoreDiSconto;
    }


    public static void saluta(String nome, int annoDiNascita) {
        if (nome.isEmpty() || annoDiNascita < 0 || annoDiNascita > 2019) {
            throw new IllegalArgumentException("Errore nei dati ricevuti");
        }
        System.out.println("Ciao, ti chiami " + nome + " e hai " + (2019 - annoDiNascita) + " anni");
    }

    public static void main(String[] args) {

        Persona p = null;
        try {
            p.getNome();
        } catch (NullPointerException e) {
            System.out.println("L'oggetto p è null, non contiene nulla");
        }

    }


    public double potenza(int base, int esponente) {
        return Math.pow(base, esponente);
    }

    public int allaSeconda(int base) {
        return base * base;
    }

    public int allaTerza(int base) {
        return allaSeconda(base) * base;

        // Oppure
        // return base * base * base;
    }
}
