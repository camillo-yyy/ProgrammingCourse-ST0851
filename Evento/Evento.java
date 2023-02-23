public class Evento {

    protected int anno;

    protected int giorno;

    Evento(int a, int g) throws Exception{

        if (a>= 2020 && g >= 1 && g <= 365) {

            this.anno = a;
            this.giorno = g;

        }
        else throw new IllegalArgumentException("Giorno o anno fuori portata");

    }

    public int getAnno() {

        return this.anno;

    }

    public int getGiorno() {

        return this.giorno;

    }


}