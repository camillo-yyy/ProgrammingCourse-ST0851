public class Stazione {

    private Misurazione misurazioni[];
    private int nmisurazione = 0;

    public Stazione(){

        misurazioni = new Misurazione[100000];

    }

    public long addMisurazione(double t, int u, int v) throws Exception{

        if(nmisurazione < misurazioni.length) {
            misurazioni[nmisurazione] = new Misurazione(t, u, v);
            nmisurazione++;
        }
        else throw new Exception("misurazioni finite");

        return misurazioni[nmisurazione-1].getUnixtime();
    }

    public double calcoloMedia (long iniziot, long finet) {

        int ncounted=0;
        int somma=0;
        int i = 0;

        while(misurazioni[i]!=null) {

            if(misurazioni[i].getUnixtime() >= iniziot && misurazioni[i].getUnixtime() <= finet) {
                somma += misurazioni[i].getUmidita();
                ncounted++;
            }
            i++;
        }

        return ncounted == 0 ? 0 : (double)somma/ncounted;


    }

    public double maxTemp (long iniziot, long finet) {

        double max=-1000;
        int i = 0;

        while(misurazioni[i]!=null) {
            
            if(misurazioni[i].getUnixtime() >= iniziot && misurazioni[i].getUnixtime() <= finet) {
                if(max==-1000) max = misurazioni[i].getTemperatura();
                else if(max < misurazioni[i].getTemperatura()) max = misurazioni[i].getTemperatura();
            }
            i++;
        }

        return max;


    }

    public String toString(){

        return super.toString() + ' ' + misurazioni[nmisurazione-1];


    }

    public static void main(String[] args) throws Exception{

        Stazione meteo = new Stazione();

        long t1 = meteo.addMisurazione(50, 1, 3);
        meteo.addMisurazione(6, 2, 3);
        long t2 = meteo.addMisurazione(20, 3, 3);
        System.out.println(meteo.maxTemp(t1, t2));
        System.out.println(meteo.calcoloMedia(t1, t2));

    }



}