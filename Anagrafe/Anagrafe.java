public class Anagrafe {

    private Persona residenti[];
    private int ultimo;

    Anagrafe(int abitanti) {

        if(abitanti > 0) {
            residenti = new Persona[abitanti];
        }
        else throw new IllegalArgumentException("abitanti errati");

    }

    public void addAbitanti(Persona x) {

        residenti[ultimo++] = x; 

    }



}