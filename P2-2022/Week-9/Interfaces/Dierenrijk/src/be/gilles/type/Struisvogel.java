package be.gilles.type;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;

public class Struisvogel extends Dier implements Eierleggend {

    private final int aantalEierenPerJaar;

    public Struisvogel(String naam, int aantalEierenPerJaar) {
        super(naam);
        this.aantalEierenPerJaar = aantalEierenPerJaar;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public String toString() {
        return String.format("""
                        Naam: %s
                        Eieren: %d
                        """,
                getNaam(), getAantalEierenPerJaar());
    }

}