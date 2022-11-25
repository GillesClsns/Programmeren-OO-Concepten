package be.gilles;

public class Kip extends Boerderijdier {

    private final int eierenPerWeek;

    public Kip(String naam, int eierenPerWeek) {

        super(naam, "Toktok", "mais");
        this.eierenPerWeek = eierenPerWeek;

    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en legt %d eieren per week.", getNaam(), getGeluid(), getVoeding(), eierenPerWeek);
    }

}