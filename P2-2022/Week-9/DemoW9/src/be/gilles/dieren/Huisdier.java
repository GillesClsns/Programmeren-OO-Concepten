package be.gilles.dieren;

public abstract class Huisdier {

    private String naam;
    private final int aantalPoten;

    public Huisdier(String naam, int aantalPoten) {

        this.naam = naam;
        this.aantalPoten = aantalPoten;

    }

    public String getNaam() {
        return naam;
    }

    public int getAantalPoten() {
        return aantalPoten;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public abstract void maakGeluid();

}
