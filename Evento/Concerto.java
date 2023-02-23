public class Concerto extends Evento {

    private final int maxposti;

    private String artista;

    public Concerto(int a, int g, int posti, String artista) throws Exception, TroppiPostiException{

        
        super(a, g);

        if(posti < 201 && posti > 0) {

            this.maxposti = posti;

        }
        else throw new TroppiPostiException(posti);
       
        this.artista = artista;


    }

    public int Posti() {

        return this.maxposti;

    }

    public String Artista() {

        return this.artista;

    }

    public String toString(){

        return super.toString() + " " + anno + " " + giorno + " " + maxposti + " " + artista;

    }



}