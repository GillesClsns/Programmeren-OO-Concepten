package be.gilles;

import java.time.LocalDate;

public class Brood {

    public enum Soort {
        GROF, WIT;
    }

    public Soort soort;
    public int nummer;
    public LocalDate vervaldatum;

    public Brood(int nummer, LocalDate vervaldatum, Soort soort) {
        this.nummer = nummer;
        this.vervaldatum = vervaldatum;
        this.soort = soort;
    }

    public int getNummer() {
        return nummer;
    }

    public LocalDate getDate() {
        return vervaldatum;
    }

    public Soort getSoort() {
        return soort;
    }

}
