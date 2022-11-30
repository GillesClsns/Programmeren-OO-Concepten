package be.gilles.type;

import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.type.Figuur;

public class Lijn extends Figuur implements HeeftOmtrek {

    private double lengte;

    public Lijn(String naam, double lengte) {

        super(naam);
        this.lengte = lengte;

    }

    public double getLengte() {
        return lengte;
    }

    @Override
    public double omtrek() {
        return lengte * 4;
    }

}
