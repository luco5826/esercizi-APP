package animale;

public class AnimaleErbivoro extends Animale implements Erbivoro{

    public AnimaleErbivoro(int numeroZampe) {
        super(numeroZampe);
    }

    @Override
    public void mangia(){
        super.mangia();
        mangiaErba();
    }
    @Override
    public void mangiaErba() {
        System.out.println(" una pianta intera");
    }
}
