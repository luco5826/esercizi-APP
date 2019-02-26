package biciclettaInterfaccia;

public class BiciElettrica implements Bicicletta {

    int wattaggioMotore;
    boolean pedalando;

    public BiciElettrica(int wattaggioMotore){
        this.wattaggioMotore = wattaggioMotore;
        this.pedalando = true;
    }

    public void accendiMotore(){
        this.pedalando = false;
    }

    public void iniziaAPedalare(){
        this.pedalando = true;
    }

    @Override
    public void accelera(int nuovaVelocita) {
        // Logica dell'accelerazione per le BiciElettriche
    }

    @Override
    public void decelera(int nuovaVelocita) {
        // Logica della decelerazione per le BiciElettriche
    }

    @Override
    public int cheRuoteMonti() {
        // Logica del diametro delle ruote per le BiciElettriche
        return 0;
    }
}
