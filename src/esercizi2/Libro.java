package esercizi2;

public class Libro {
    private String titolo, autore;
    private int numeroPagine;
    private int paginaAttuale;

    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        if (numeroPagine < 0) {
            System.out.println("Pagine del libro negative");
            this.numeroPagine = 0;
        } else {
            this.numeroPagine = numeroPagine;
        }
        paginaAttuale = 0;
    }

    public int getPaginaAttuale() {
        return paginaAttuale;
    }

    public void setPaginaAttuale(int paginaAttuale) {
        this.paginaAttuale = paginaAttuale;
    }

    public int avanzamentoTotale() {
        return this.paginaAttuale * 100 / this.numeroPagine;
    }
}
