public class Martello extends Articolo{

    private Materiale materiale;
    
    public Martello(double prezzo, double p, int cod, int q, Materiale materiale){

        super(prezzo, p, cod, q);
        this.materiale = materiale;
    }

}
