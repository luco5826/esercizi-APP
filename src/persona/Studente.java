package persona;

public class Studente extends Persona{

    private int numeroDiMatricola;

    public Studente(String nome, String cognome, int annoDiNascita, int numeroDiMatricola){
        super(nome, cognome, annoDiNascita);
        this.numeroDiMatricola = numeroDiMatricola;
    }

    @Override
    public String dimmiIlTuoNome() {
        return super.dimmiIlTuoNome() + " e sono uno studente";
    }
}
