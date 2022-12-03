package be.gilles;

import java.util.Objects;

public class Bestuurslid extends Lid {

    private final String functie;

    public Bestuurslid(String naam, long nummer, String functie) {
        super(naam, nummer);
        this.functie = functie;
    }

    @Override
    public String toString() {
        return String.format("bestuurslid %s", getNaam());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bestuurslid other) {
            return Objects.equals(naam, other.getNaam()) &&
                    Objects.equals(nummer, other.getNaam()) &&
                    Objects.equals(functie, other.functie);
        }
        return false;
    }

}