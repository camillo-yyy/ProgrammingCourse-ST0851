public class Biglietto {

    private Evento evento;

    private static int nserialeglobale = 1;

    private int nseriale;

    public Biglietto(Evento evento) {

        this.evento = evento;

        if(Biglietto.nserialeglobale < 1000){

            this.nseriale = Biglietto.nserialeglobale;
            Biglietto.nserialeglobale++;

        }
        else throw new IllegalArgumentException("brum");

    }

    public String toString(){

        return super.toString() + " " + evento + " " + nseriale;

    }


    
}
