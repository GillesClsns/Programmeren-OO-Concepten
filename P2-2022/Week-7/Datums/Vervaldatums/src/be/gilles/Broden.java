package be.gilles;

import java.time.LocalDate;

import be.gilles.Brood.*;

public class Broden {

    private static Brood[] broden;
    private int aantal;
    private int volgendNummer;

    public Broden() {

        broden = new Brood[100];
        aantal = 0;
        volgendNummer = 1000;

    }

    public void voegBroodToe(Soort soort, LocalDate vervaldatum) {

        broden[aantal++] = new Brood(volgendNummer, soort, vervaldatum);
        volgendNummer++;

    }

    public void printBroden() {

        for (Brood x : broden) {
            System.out.println(x);

        }

    }

    public void printBrodenByDate(LocalDate date) {

        for (Brood brood : broden) {

            if (brood.getVervaldatum().equals(date)) {

                System.out.println(brood);

            }

        }

    }

}