/*  Definire una classe ContoCorrente che supporti le seguenti operazioni:
get_saldo per la lettura del saldo; deposita per effettuare un deposito;
preleva per effettuare un prelievo; get_saldo_massimo per la lettura del
saldo più alto mai raggiunto dal conto corrente nel corso della sua esistenza
 */
public class Treno{

    // Attributi
    private Vagone testa;
    private String nome;

    // Costruttore
    public Treno(String nome){

        this.nome=nome;

    }

    public Treno(String nome, Vagone testa){

        this.nome=nome;
        this.testa=testa;

    }

    public void attacca(Vagone t) throws Exception {


        if(!(t instanceof Locomotiva)) throw new Exception();
        else this.testa = t;

    }

    // Metodi
    public double pesoR(Vagone s){

        if(s==null) return 0;
        else return s.get_peso() + pesoR(s.getSuccessivo());


    }

    public Vagone getTesta() {

        return this.testa;

    }

    public static void main(String [] args) {

        Treno Boss = new Treno("boss");
        try {
            Vagone Merci = new Merci(1, 3);
            Vagone Passeggeri = new Passeggeri(1, 100);
            Vagone Locomotiva = new Locomotiva(1, 20);
            Boss.attacca(Vagone.getTesta());
        }
        catch(IllegalArgumentException e) {

            System.out.println("errore nell'input");

        }
        catch(Exception e){

            System.out.println("bo");
            
        }

        System.out.println(Boss.pesoR(Boss.getTesta()));

    }
        
}