package be.gilles;

import java.time.LocalDate;
import java.util.Random;

public class Brood {

    public int nummer;
    public Soort soort;
    public LocalDate vervaldatum;

    public enum Soort {
        GROF, WIT
    }

    public Brood(int nummer, Soort soort, LocalDate vervaldatum) {

        this.nummer = nummer;
        this.soort = soort;
        this.vervaldatum = vervaldatum;

    }

    public int getNummer() {
        return nummer;
    }

    public Soort getSoort() {
        return soort;
    }

    public LocalDate getVervaldatum() {
        return vervaldatum;
    }

    public static Soort randomSoort() {
        Soort[] soort = Soort.values();
        return soort[new Random().nextInt(soort.length)];
    }

    @Override
    public String toString() {
        return String.format("%d %s (%s)", getNummer(), getSoort(), getVervaldatum());
    }

}