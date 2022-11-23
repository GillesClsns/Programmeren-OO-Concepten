package be.gilles;

public class Persoon {

    private final String naam;

    Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s", naam);
    }

}
