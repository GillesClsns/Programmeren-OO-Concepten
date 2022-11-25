package be.gilles;

public class Telefoonnummer {

    private final Soort soort;
    private final String nummer;

    private enum Soort {
        VAST, MOBIEL
    }

    public Telefoonnummer(Soort soort, String nummer) {

        this.soort = soort;
        this.nummer = nummer;

    }

    @Override
    public String toString() {
        return String.format("%s %s", soort, nummer);
    }

}