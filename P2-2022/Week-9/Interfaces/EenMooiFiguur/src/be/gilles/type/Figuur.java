package be.gilles.type;

public abstract class Figuur {

    private String naam;

    public Figuur(String naam) {

        this.naam = naam;

    }

    public String getNaam() {
        return naam;
    }

}