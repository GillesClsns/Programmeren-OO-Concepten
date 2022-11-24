package be.gilles;

public class Konijn extends Boerderijdier {

    private final boolean isGraver;

    public Konijn(String naam, boolean isGraver) {

        super(naam, "Snifsnif", "gras");
        this.isGraver = true;

    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en graaf %s.", getNaam(), getGeluid(), getVoeding(), isGraver ? "wel" : "niet");
    }

}