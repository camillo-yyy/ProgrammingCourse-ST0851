public class TroppiPostiException extends Exception {

    private int posti;

    public TroppiPostiException(int posti){

        super("hai inserito n.posti sbagliati"+posti);
        this.posti = posti;

    }



}