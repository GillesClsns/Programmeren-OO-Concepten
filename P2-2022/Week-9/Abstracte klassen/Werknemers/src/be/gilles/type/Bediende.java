package be.gilles.type;

import be.gilles.Werknemer;

public class Bediende extends Werknemer {

    private final int LOONFACTOR = 192;
    private final double weddeBarema;

    public Bediende(String naam, long rijksregisternummer, double weddeBarema) {

        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;

    }

    public double getLoon() {
        return getUURLOON() * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Loon: €%.1f""", super.toString() ,getLoon());
    }

}
