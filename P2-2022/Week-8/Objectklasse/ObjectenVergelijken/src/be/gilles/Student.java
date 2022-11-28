package be.gilles;

import java.util.Objects;

public class Student {

    private final String naam;
    private final int nummer;

    public Student(String naam, int nummer) {

        this.naam = naam;
        this.nummer = nummer;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student other) {
            return Objects.equals(naam, other.naam) &&
                    Objects.equals(nummer, other.nummer);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, nummer);
    }

}