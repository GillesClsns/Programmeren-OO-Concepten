package be.gilles;

public class Telefoonnummer {

    private enum Soort {
        VAST, MOBIEL
    }

    private final Soort soort;
    private final String nummer;

    public Telefoonnummer(Soort soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return String.format("%s %s", soort, nummer);
    }

}
