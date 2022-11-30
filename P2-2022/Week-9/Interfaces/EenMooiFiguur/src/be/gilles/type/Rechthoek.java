package be.gilles.type;

import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.interfaces.HeeftOppervlakte;

public class Rechthoek extends Figuur implements HeeftOmtrek, HeeftOppervlakte {

    public double lengte;
    public double breedte;

    public Rechthoek(String naam, double lengte, double breedte) {

        super(naam);
        this.lengte = lengte;
        this.breedte = breedte;

    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    @Override
    public double omtrek() {
        return (this.lengte * 2) + (this.breedte * 2);
    }

    @Override
    public double oppervlakte() {
        return this.lengte * this.breedte;
    }

}
