package biciclettaEreditaria;

public class MountainBike extends Bicicletta {

    int numeroMarce;
    int marciaAttuale;

    public MountainBike(int velocita, int diametroRuota, int annoDiFabbircazione, int numeroMarce){
        super(velocita, diametroRuota, annoDiFabbircazione);
        this.numeroMarce = numeroMarce;
        this.marciaAttuale = 1;
    }

    public void aumentaMarcia(){
        if (this.marciaAttuale == this.numeroMarce) {
            return;
        } else {
            this.marciaAttuale++;
        }
    }

    public void diminuisciMarcia(){
        if (this.marciaAttuale == 1) {
            return;
        } else {
            this.marciaAttuale--;
        }
    }


}
