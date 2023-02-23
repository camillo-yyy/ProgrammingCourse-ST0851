public abstract class Persona {

    protected String nome;
    protected String cognome;
    protected long unixTime;
    protected Persona compagno;

    public Persona(String nome, String cognome, long unixTime) {

        this.nome = nome;
        this.cognome = cognome;
        this.unixTime = unixTime;

    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public long getUnixTime() {
        return this.unixTime;
    }

    public void setUnixTime(long unixTime) {
        this.unixTime = unixTime;
    }


}