package be.gilles;

public class Adres {

    private String straatNr;
    private int postNummer;

    public Adres(String straatNr, int postNummer) {
        this.straatNr = straatNr;
        this.postNummer = postNummer;
    }

    public String getStraatNr() {
        return straatNr;
    }

    public int getPostNummer() {
        return postNummer;
    }

    public void setStraatNr(String straatNr) {
        this.straatNr = straatNr;
    }

    public void setPostNummer(int postNummer) {
        this.postNummer = postNummer;
    }

    @Override
    public String toString() {
        return String.format("Adres: %s, %d", straatNr, postNummer);
    }

}
