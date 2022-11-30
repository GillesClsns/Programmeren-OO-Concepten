package be.gilles.bibliotheek;

public class Nummerplaat implements Vergelijkbaar {

    private final String nummer;

    public Nummerplaat(String nummer) {
        this.nummer = nummer;
    }

    public String getNummer() {
        return nummer;
    }

    @Override
    public boolean isKleinerDan(Vergelijkbaar vergelijkbaar) {
        if (!(vergelijkbaar instanceof Nummerplaat nummerplaat)) {
            return false;
        }
        return this.nummer.compareTo(nummerplaat.nummer) == 0;
    }

    @Override
    public boolean isGroterDan(Vergelijkbaar vergelijkbaar) {
        return false;
    }

    @Override
    public boolean isGelijkAan(Vergelijkbaar vergelijkbaar) {
        return false;
    }
}
