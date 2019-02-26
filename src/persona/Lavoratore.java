package persona;

public class Lavoratore extends Persona {

    private int numeroDiBadge;

    public Lavoratore(String nome, String cognome, int annoDiNascita, int numeroDiBadge) {
        super(nome, cognome, annoDiNascita);
        this.numeroDiBadge = numeroDiBadge;
    }

    @Override
    public String dimmiIlTuoNome() {
        return super.dimmiIlTuoNome() + " e sono uno lavoratore";
    }
}
