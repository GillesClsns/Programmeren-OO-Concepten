package be.gilles;

import jdk.jfr.Percentage;

public class BierVat {

    private double capaciteit;
    private double inhoud;

    public void setCapaciteit(double capaciteit) {
        this.capaciteit = capaciteit;
    }

    public void setInhoud(double inhoud) {
        this.inhoud = inhoud;
    }

    public void vulVolledig() {
        this.inhoud = this.capaciteit;
    }

    public Boolean isVol() {
        return this.inhoud == capaciteit;

    }

    public void tap(double liters) {
        if (liters > inhoud) {
            System.out.println("De inhoud kan niet negatief zijn!");
        } else this.inhoud -= liters;
    }

    public double percentageGevuld() {
        return (this.inhoud / this.capaciteit) * 100;
    }

}
