public class Piastrelle extends Articolo implements Copertura{


    public double dimensioneX;
    public double dimensioneY;
    public static final double metro = 1.0;

    
    public Piastrelle(double prezzo, double p, int cod, int q, double dimX, double dimY){

        super(prezzo, p, cod, q);
        dimensioneX = dimX;
        dimensioneY = dimY;

    }


    public double coperturaMq(){

        return metro/dimensioneX*dimensioneY*100;

    }
    
}
