package be.gilles;

import java.util.Objects;

public class Student {

    private final String naam;
    private final int nummer;

    public Student(String naam, int nummer) {

        this.naam = naam;
        this.nummer = nummer;

    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
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