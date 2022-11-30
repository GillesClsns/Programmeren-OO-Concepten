package be.gilles.bibliotheek;

public class Boek implements Vergelijkbaar {

    private final String titel;
    private final String auteur;

    public Boek(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public boolean isKleinerDan(Vergelijkbaar vergelijkbaar) {
        if (!(vergelijkbaar instanceof Boek)) {
            return false;
        }
        Boek boek = (Boek) vergelijkbaar;
        return this.auteur.compareTo(boek.auteur) < 0;
    }

    @Override
    public boolean isGroterDan(Vergelijkbaar vergelijkbaar) {
        return false;
    }

    @Override
    public boolean isGelijkAan(Vergelijkbaar vergelijkbaar) {
        return false;
    }

}
