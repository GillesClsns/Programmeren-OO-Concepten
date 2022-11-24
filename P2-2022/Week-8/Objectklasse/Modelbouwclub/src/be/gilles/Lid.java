package be.gilles;

import java.util.Objects;

public class Lid {

    public final String naam;
    public final long nummer;

    public Lid(String naam, long nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public long getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return String.format("%s", naam);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lid) {
            Lid other = (Lid) obj;
            return Objects.equals(nummer, other.nummer);
        }
        return false;
    }

}