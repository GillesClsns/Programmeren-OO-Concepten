package be.gilles;

import be.gilles.interfaces.Dier;

public class Dieren {

    Dier[] dieren = new Dier[100];
    private int aantal;

    public Dieren() {

        aantal = 0;

    }

    public void voegToe(Dier dier) {

        dieren[aantal++] = dier;

    }

    public void toon() {

        for (Dier x : dieren) {

            if (!(x == null))
                System.out.println(x);

        }

    }

}