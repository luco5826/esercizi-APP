package animale;

public class AnimaleCarnivoro extends Animale implements Carnivoro {

    public AnimaleCarnivoro(int numeroZampe) {
        super(numeroZampe);
    }

    @Override
    public void mangia(){
        super.mangia();
        mangiaCarne();
    }

    @Override
    public void mangiaCarne() {
        System.out.println(" una bella bistecca");
    }
}
