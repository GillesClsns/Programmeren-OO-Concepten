package be.gilles.type;

import be.gilles.interfaces.HeeftVolume;

public class Bol extends Figuur implements HeeftVolume {


    private double straal;

    public Bol(String naam, double straal) {

        super(naam);
        this.straal = straal;

    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double volume() {
        return 4F / 3F * (Math.PI * (Math.pow(straal, 3)));
    }

}
