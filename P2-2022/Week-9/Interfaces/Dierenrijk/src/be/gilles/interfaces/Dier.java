package be.gilles.interfaces;

public abstract class Dier {

    private final String naam;

    public Dier(String naam) {

        this.naam = naam;

    }

    public String getNaam() {
        return naam;
    }

}
