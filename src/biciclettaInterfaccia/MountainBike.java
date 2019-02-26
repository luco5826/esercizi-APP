package biciclettaInterfaccia;

public class MountainBike implements Bicicletta {

    int numeroMarce;
    int marciaAttuale;

    public MountainBike(int numeroMarce){

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


    @Override
    public void accelera(int nuovaVelocita) {
        // Logica dell'accelerazione per le MountainBike
    }

    @Override
    public void decelera(int nuovaVelocita) {
        // Logica della decelerazione per le MountainBike
    }

    @Override
    public int cheRuoteMonti() {
        // Logica del diametro delle ruote per le MountainBike
        return 0;
    }
}
