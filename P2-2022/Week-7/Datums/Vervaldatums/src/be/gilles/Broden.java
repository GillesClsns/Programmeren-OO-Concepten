package be.gilles;

import java.time.format.DateTimeFormatter;

import static be.gilles.Brood.*;

public class Broden {

    public Brood[] broden;
    public int aantal;
    public int volgendNummer;

    public Broden() {
        this.broden = new Brood[100];
        this.aantal = 0;
        this.volgendNummer = 1000;
    }

}
