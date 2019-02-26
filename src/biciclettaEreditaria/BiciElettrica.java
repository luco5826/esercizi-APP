package biciclettaEreditaria;

public class BiciElettrica extends Bicicletta{

    int wattaggioMotore;
    boolean pedalando;

    public BiciElettrica(int velocita, int diametroRuota, int annoDiFabbircazione, int wattaggioMotore){
        super(velocita, diametroRuota, annoDiFabbircazione);
        this.wattaggioMotore = wattaggioMotore;
        this.pedalando = true;
    }

    public void accendiMotore(){
        this.pedalando = false;
    }

    public void iniziaAPedalare(){
        this.pedalando = true;
    }
}
