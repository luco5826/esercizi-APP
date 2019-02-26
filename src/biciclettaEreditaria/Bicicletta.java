package biciclettaEreditaria;

public class Bicicletta {
    private int velocita;
    private int diametroRuota;
    private int annoDiFabbricazione;

    public Bicicletta(int velocita, int diametroRuota, int annoDiFabbricazione) {
        this.velocita = velocita;
        this.diametroRuota = diametroRuota;
        this.annoDiFabbricazione = annoDiFabbricazione;
    }

    public void accelera(int nuovaVelocita){
        if(nuovaVelocita < this.velocita){
            System.out.println("La nuova velocità non può essere più piccola di quella vecchia quando si accelera");
        } else {
            this.velocita = nuovaVelocita;
        }
    }

    public void decelera(int nuovaVelocita){
        if(nuovaVelocita > this.velocita){
            System.out.println("La nuova velocità non può essere più grande di quella vecchia quando si decelera");
        } else {
            this.velocita = nuovaVelocita;
        }
    }

    public int getAnnoDiFabbricazione() {
        return this.annoDiFabbricazione;
    }

    public int getDiametroRuota() {
        return this.diametroRuota;
    }
}
