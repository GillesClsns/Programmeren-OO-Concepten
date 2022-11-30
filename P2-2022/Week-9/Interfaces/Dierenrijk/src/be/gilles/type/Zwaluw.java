package be.gilles.type;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Zwaluw extends Dier implements Eierleggend, Vliegend {

    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;

    public Zwaluw(String naam, int aantalEierenPerJaar, double maxVliegsnelheid) {

        super(naam);
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxVliegsnelheid = maxVliegsnelheid;

    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public double getMaxVliegsnelheid() {
        return maxVliegsnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Eieren: %d
                Snelheid: %.0f km/h
                """,
                getNaam(), getAantalEierenPerJaar(), getMaxVliegsnelheid());
    }

}