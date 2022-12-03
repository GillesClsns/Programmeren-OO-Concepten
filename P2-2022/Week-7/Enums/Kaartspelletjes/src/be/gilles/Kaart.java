package be.gilles;

import java.util.Random;

public class Kaart {

    private final Kaartkleur kaartkleur;
    private final Kaartwaarde kaartwaarde;
    private int totalValue;

    public Kaart(Kaartkleur kaartkleur, Kaartwaarde kaartwaarde) {
        this.kaartkleur = kaartkleur;
        this.kaartwaarde = kaartwaarde;
    }

    public Kaart() {
        int i = new Random().nextInt(Kaartkleur.values().length);
        this.kaartkleur = Kaartkleur.values()[i];
        int j = new Random().nextInt(Kaartwaarde.values().length);
        this.kaartwaarde = Kaartwaarde.values()[j];
    }

    public Kaartkleur getKaartkleur() {
        return kaartkleur;
    }

    public Kaartwaarde getKaartwaarde() {
        return kaartwaarde;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)\n", kaartkleur, kaartkleur, kaartwaarde.value);
    }

}