package be.gilles;

public class Koe extends Boerderijdier {

    private final double literMelkPerDag;

    public Koe(String naam, double literMelkPerDag) {

        super(naam, "Boeboe", "gras");
        this.literMelkPerDag = literMelkPerDag;

    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en geeft %.1f liter melk per dag.", getNaam(), getGeluid(), getVoeding(), literMelkPerDag);
    }

}