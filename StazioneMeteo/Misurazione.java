public class Misurazione {
    
    private double temperatura; // invariante di classe -40 <= x <= 50
    private int umidita; // 0 <= x <= 100
    private int vento; // direzione in gradi 0 <= x <= 360
    private long unixtime; 

    public Misurazione (double t, int u, int v) throws IllegalArgumentException{

        if(t >= -40 && t <= 50 && u >= 0 && u <= 100 && v >= 0 && v <= 100) {
            temperatura = t;
            umidita = u;
            vento = v;
        }
        else throw new IllegalArgumentException("Valori inseriti fuori scala");
        unixtime = System.currentTimeMillis();

    }

    public double getTemperatura() {

        return temperatura;

    }

    public int getUmidita() {

        return umidita;

    }

    public int getVento() {

        return vento;

    }

    public long getUnixtime() {

        return unixtime;

    }


}
