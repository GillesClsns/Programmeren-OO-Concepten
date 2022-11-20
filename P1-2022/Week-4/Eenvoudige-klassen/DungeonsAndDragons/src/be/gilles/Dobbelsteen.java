package be.gilles;

import java.util.Random;

public class Dobbelsteen {

    private int amountOfSides;

    public void setAmountOfSides(int amountOfSides) {
        this.amountOfSides = amountOfSides;
    }

    public void gooi() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Druk op <enter> om een waarde te creëren");
            System.out.println(new Random().nextInt(1, amountOfSides));

        }

        System.out.println("Klaar.");

    }

}
