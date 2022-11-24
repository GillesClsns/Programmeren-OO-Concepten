package be.gilles;

public class Adres {

    private String straatNr;
    private int postNummer;

    public Adres(String straatNr, int postNummer) {

        this.straatNr = straatNr;
        this.postNummer = postNummer;

    }

    public void setAdres(String straatNr, int postNummer) {

        this.straatNr = straatNr;
        this.postNummer = postNummer;

    }

    public String getStraatNr() {
        return straatNr;
    }

    public int getPostNummer() {
        return postNummer;
    }

    @Override
    public String toString() {

        if(straatNr.isEmpty()) return "Adres onbekend";
        else return String.format("Adres: %s, %d", straatNr, postNummer);

    }

}