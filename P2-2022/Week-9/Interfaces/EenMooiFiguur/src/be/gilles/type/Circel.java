package be.gilles.type;

import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.interfaces.HeeftOppervlakte;

public class Circel extends Figuur implements HeeftOmtrek, HeeftOppervlakte {

    private double straal;

    public Circel(String naam, double straal) {

        super(naam);
        this.straal = straal;

    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double omtrek() {
        return (straal * 2) * Math.PI;
    }

    @Override
    public double oppervlakte() {
        return Math.pow(straal, 2) * Math.PI;
    }

}
