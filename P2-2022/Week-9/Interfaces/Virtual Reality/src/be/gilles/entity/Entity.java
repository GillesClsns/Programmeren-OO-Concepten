package be.gilles.entity;

public abstract class Entity {

    private final String naam;
    protected final double[] position;

    public Entity(String naam, double[] position) {

        this.naam = naam;
        this.position = position;

    }

    public String getNaam() {
        return naam;
    }

    public double[] getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format("%s (%.1f, %.1f, %.1f)",
                getNaam(), getPosition()[0], getPosition()[1], getPosition()[2]);
    }

}
