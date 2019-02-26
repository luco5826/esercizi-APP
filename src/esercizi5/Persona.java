package esercizi5;

public class Persona {
    private String nome;
    private String cognome;
    private int annoDiNascita;


    public Persona(String nome, String cognome, int annoDiNascita) {

        this.nome = nome;
        this.cognome = cognome;

        if (annoDiNascita < 0) {
            System.out.println("Anno di nascita negativo");
            this.annoDiNascita = 0;
        } else {
            this.annoDiNascita = annoDiNascita;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public int quantiAnniHai(int annoCorrente){
        return annoCorrente - annoDiNascita;
    }

    public boolean omonimi(Persona that){
        return this.nome.equals(that.nome);
    }
}


