package be.gilles;

public class Boek {

    private final String auteur;
    private final String titel;
    private final int paginas;
    private final Boolean ontleend;

    public Boek(String auteur, String titel, int paginas, Boolean ontleend) {
        this.auteur = auteur;
        this.titel = titel;
        this.paginas = paginas;
        this.ontleend = ontleend;
    }

    public Boek() {
        this.auteur = "onbekend";
        this.titel = "onbekend";
        this.paginas = 0;
        this.ontleend = false;
    }

    public String isOntleend() {
        return ontleend ? "" : "niet";
    }

    @Override
    public String toString() {
        return String.format("Het boek %s (%d pagina's), geschreven door %s is momenteel %s ontleend.\n", titel.toUpperCase(), paginas, auteur.toUpperCase(), this.isOntleend());
    }

}