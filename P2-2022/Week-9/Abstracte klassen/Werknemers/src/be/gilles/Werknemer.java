package be.gilles;

public abstract class Werknemer {

    private final double UURLOON = 12.5;
    private final String naam;
    private final long rijksregisternummer;

    public Werknemer(String naam, long rijksregisternummer) {

        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;

    }

    public double getUURLOON() {
        return UURLOON;
    }

    public String getNaam() {
        return naam;
    }

    public long getRijksregisternummer() {
        return rijksregisternummer;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Nummer: %d""",
                getNaam(), getRijksregisternummer());
    }

}
