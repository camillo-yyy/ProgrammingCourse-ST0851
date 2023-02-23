public abstract class Articolo {

    private double prezzo;
    private double peso;
    private int codice;
    private int quantità;

    public Articolo (double prezzo, double p, int cod, int q) {

        if(prezzo > 0 && p > 0 && cod > 0 && q > 0) {

            this.prezzo = prezzo;
            p=peso;
            codice=cod;
            quantità=q;

        }
        else throw new IllegalArgumentException("Dati errati");

    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodice() {
        return this.codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getQuantità() {
        return this.quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }


}