/*  Definire una classe ContoCorrente che supporti le seguenti operazioni:
get_saldo per la lettura del saldo; deposita per effettuare un deposito;
preleva per effettuare un prelievo; get_saldo_massimo per la lettura del
saldo più alto mai raggiunto dal conto corrente nel corso della sua esistenza
 */
public abstract class Vagone{

    // Attributi
    private static Vagone testa;
    private double peso;
    private Vagone successivo;

    // Costruttore
    public Vagone(double p) throws IllegalArgumentException{

        if(testa==null) Vagone.testa = this;
        else {
            this.successivo = Vagone.testa;
            Vagone.testa = this;
        }
        if(p < 100 && p > 0) this.peso=p;
        else throw new IllegalArgumentException();

    }

    // Metodi
    public double get_peso(){

        return this.peso;

    }

    public Vagone getSuccessivo() {

        return this.successivo;

    }

    public static Vagone getTesta() {

        return Vagone.testa;

    }


        
}