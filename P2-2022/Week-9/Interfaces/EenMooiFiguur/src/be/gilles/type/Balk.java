package be.gilles.type;

import be.gilles.interfaces.HeeftVolume;

public class Balk extends Figuur implements HeeftVolume {

    private Rechthoek basisvlak;
    private final double hoogte;

    public Balk(String naam, double lengte, double breedte, double hoogte) {

        super(naam);
        lengte = basisvlak.lengte;
        breedte = basisvlak.breedte;
        this.hoogte = hoogte;

    }

    public double getLengte() {
        return getLengte();
    }

    public double getBreedte() {
        return getBreedte();
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public double volume() {
        return getLengte() * getBreedte() * getHoogte();
    }
}
