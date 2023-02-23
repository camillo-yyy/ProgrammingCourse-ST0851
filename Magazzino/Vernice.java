public class Vernice extends Articolo implements Copertura{
    
    private Colore colore;
    private double quantità;
    private double copertura;

    public Vernice(double prezzo, double p, int cod, int q){

        super(prezzo, p, cod, q);

    }

    public double coperturaMq () {

        return copertura;

    }

}
