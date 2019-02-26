package esercizi3;

import persona.Persona;

public class Esercizi3 {



    public static void saluta(String nome, int annoDiNascita) {
        System.out.println("Ciao, ti chiami " + nome + " e hai " + (2019 - annoDiNascita) + " anni");
    }
    public static double convertiValuta(double euro) {
        double importoInDollari = euro * 1.331;
        return importoInDollari;
    }

    public static boolean accedi(String username, String password) {


        if (username.equals("mastro") && password.equals("geppetto")) {
            return true;
        } else {
            return false;
        }

        // O più semplicemente
        // return username.equals("mastro") && password.equals("geppetto");
    }


    public static boolean omonimi(Persona a, Persona b) {

        if(a.nome.equals(b.nome)) {
            return true;
        } else {
            return false;
        }

        // O più semplicemente
        //return p1.dimmiIlTuoNome().equals(p2.dimmiIlTuoNome());
    }

}
