public class MyMain {
    
    public static void main(String [] Args) throws Exception{


        Evento concerto = new Concerto(2021, 1, 201, "Pollo");
        System.out.println(concerto.toString());
        Biglietto b1 = new Biglietto(concerto);
        System.out.println(b1.toString());
        Biglietto b2 = new Biglietto(concerto);
        System.out.println(b2.toString());

        
    }

}
