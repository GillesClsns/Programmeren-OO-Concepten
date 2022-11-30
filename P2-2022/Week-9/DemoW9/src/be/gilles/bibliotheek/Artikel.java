package be.gilles.bibliotheek;

public class Artikel implements Vergelijkbaar {

    private final String titel;
    private String[] auteurs;

    public Artikel(String titel, String[] auteurs) {
        this.titel = titel;
        this.auteurs = auteurs;
    }

    public String getTitel() {
        return titel;
    }

    public String[] getAuteurs() {
        return auteurs;
    }

    @Override
    public boolean isKleinerDan(Vergelijkbaar vergelijkbaar) {
        if (!(vergelijkbaar instanceof Artikel)) {
            return false;
        }
        Artikel artikel = (Artikel) vergelijkbaar;
        return this.auteurs[0].compareTo(artikel.auteurs[0]) < 0;
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
