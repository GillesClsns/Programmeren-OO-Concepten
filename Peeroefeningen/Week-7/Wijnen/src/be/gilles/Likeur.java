package be.gilles;

import java.time.LocalDate;

public class Likeur extends Wijn {

    private final double alcoholGehalte;

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehalte ;
    }

    public double getAlcoholGehalte() {
        return alcoholGehalte * 100;
    }

    @Override
    public double berekenPrijs() {
        if (alcoholGehalte >= 0.50) {
            return getBasisPrijs() * 1.25;
        } else return getBasisPrijs();
    }

    @Override
    public String toString() {
        return String.format("""
                %s --> %.0f%% alc.""", super.toString(), getAlcoholGehalte());
    }
}