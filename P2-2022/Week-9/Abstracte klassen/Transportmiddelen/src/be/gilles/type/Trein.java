package be.gilles.type;

import be.gilles.Transportmiddel;

public class Trein extends Transportmiddel {

    public Trein(double snelheid) {

        super(snelheid);

    }

    public String getGeluid() {
        return "tuut";
    }

    @Override
    public void legAfstandAf(double afstand) {

        int i = (int) ((afstand * 10) / getSnelheid());

        for (int j = 0; j < i; j++) {

            System.out.print(getGeluid());

        }

    }

    @Override
    public String toString() {
        return getGeluid();
    }

}
