package be.gilles;

public record Lid(int id, String naam, Soort soort) {

    @Override
    public String toString() {
        return String.format("%d %10s soort: %s", id, naam, soort);

    }

}