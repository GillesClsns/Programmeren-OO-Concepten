package be.gilles.type;

import be.gilles.Transportmiddel;

public class Bus extends Transportmiddel {


    public Bus(double snelheid) {

        super(snelheid);
        setGeluid("vroem");

    }

    @Override
    public String toString() {
        return getGeluid();
    }

}
