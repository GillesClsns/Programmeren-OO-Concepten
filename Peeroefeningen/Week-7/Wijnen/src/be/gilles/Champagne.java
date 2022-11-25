package be.gilles;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Champagne extends Wijn {

    private final Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    public Smaak getSmaak() {
        return smaak;
    }

    @Override
    public double berekenPrijs() {

        if(this.smaak.toString().toLowerCase().contains("brut")) return getBasisPrijs() * 1.10;

        else return getBasisPrijs();

    }

    @Override
    public String toString() {
        return String.format("""
                %s --> Type: %s""", super.toString(), getSmaak());
    }
}
