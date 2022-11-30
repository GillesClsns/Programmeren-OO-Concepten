package be.gilles.type;

import be.gilles.Transportmiddel;

public class TeVoet extends Transportmiddel {

    public TeVoet(double snelheid) {

        super(snelheid);

    }

    public String getGeluid() {
        return "stap";
    }

    @Override
    public void legAfstandAf(double afstand) {

        int i = (int) ((afstand * 10) / getSnelheid());

        for (int j = 0; j <= i; j++) {

            System.out.print(getGeluid());

        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
