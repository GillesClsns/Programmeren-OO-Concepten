package be.gilles.type;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Arend extends Dier implements Eierleggend, Vliegend {

    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;
    private double duiksnelheid;

    public Arend(String naam, int aantalEierenPerJaar, double maxVliegsnelheid, double duiksnelheid) {

        super(naam);
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxVliegsnelheid = maxVliegsnelheid;
        this.duiksnelheid = duiksnelheid;

    }

    @Override
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }

    @Override
    public double getMaxVliegsnelheid() {
        return this.maxVliegsnelheid;
    }

    public double getDuiksnelheid() {
        return this.duiksnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Eieren: %d
                Snelheid: %.0f km/h
                Duiksnelheid: %.0f km/h
                """,
                getNaam(), getAantalEierenPerJaar(), getMaxVliegsnelheid(), getDuiksnelheid());

    }

}
