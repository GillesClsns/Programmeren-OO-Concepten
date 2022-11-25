package be.gilles;

import java.time.LocalDate;

public class Wijn {

    private final String naam;
    private final String streek;
    private final LocalDate oogstDatum;
    private final double basisPrijs;

    public Wijn(String naam, String streek, LocalDate oogstDatum, double basisPrijs) {

        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;

    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public LocalDate getOogstDatum() {
        return oogstDatum;
    }

    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        return basisPrijs;
    }

    public String getKenmerken() {
        return String.format("Van %d, afkomstig uit %s.", getOogstDatum().getYear(), getStreek());
    }

    @Override
    public String toString() {
        return String.format("""
                %s                           € %4.2f
                \t (Van %s, afkomstig uit %s)""", getNaam(), berekenPrijs(), getOogstDatum().getYear(), getStreek());
    }

}