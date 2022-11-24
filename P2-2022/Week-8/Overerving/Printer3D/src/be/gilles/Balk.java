package be.gilles;

import java.util.ArrayList;

public class Balk extends PrimitiefObject {

    ArrayList<Double> afmetingen = new ArrayList<>();

    public Balk(double getX, double getY, double getZ, double breedte, double hoogte, double diepte) {

        super(getX, getY, getZ);
        afmetingen.add(0, breedte);
        afmetingen.add(1, hoogte);
        afmetingen.add(2, diepte);

    }

    public double getBreedte() {
        return afmetingen.get(0);
    }

    @Override
    public double volume() {
        return afmetingen.get(0) * afmetingen.get(1) * afmetingen.get(2);
    }

    @Override
    public String toString() {
        return String.format("Balk met afmetingen (%.1f, %.1f, %.1f) op plaats (%.1f, %.1f, %.1f) en volume %.2f", afmetingen.get(0), afmetingen.get(1), afmetingen.get(2), getX(), getY(), getZ(), this.volume());
    }

}