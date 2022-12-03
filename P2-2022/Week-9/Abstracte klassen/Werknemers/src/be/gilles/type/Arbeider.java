package be.gilles.type;

import be.gilles.Werknemer;

public class Arbeider extends Werknemer {

    private final int MAX_UREN_PER_WEEK = 38;
    private final int aantalUren;

    public Arbeider(String naam, long rijksregisternummer, int aantalUren) {

        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;

    }

    public double getLoon() {

        double total = aantalUren * getUURLOON();
        double overTime = ((aantalUren - 39) * getUURLOON()) * 1.50;
        return total + overTime;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Loon: €%.1f""", super.toString() ,getLoon());
    }

}
