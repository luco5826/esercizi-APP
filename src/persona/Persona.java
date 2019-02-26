package persona;

public class Persona{
    public String nome;
    public String cognome;
    protected int annoDiNascita;


    public Persona(String nome, String cognome, int annoDiNascita){

        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
    }


    public String dimmiIlTuoNome(){
        return nome + " " + cognome;
    }

    public boolean omonimi(Persona that){
        return this.dimmiIlTuoNome().equals(that.dimmiIlTuoNome());
    }
//
//    public int inCheAnnoSeiNato(){
//        return annoDiNascita;
//    }
//
//    public int quantiAnniHai(int annoCorrente){
//        return annoCorrente - annoDiNascita;
//    }


}


