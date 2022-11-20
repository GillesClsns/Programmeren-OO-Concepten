package be.gilles;

public class Main {

    public static void main(String[] args) {

        BierVat bierVat = new BierVat();

        bierVat.setCapaciteit(15.0);
        bierVat.vulVolledig();

        System.out.println(bierVat.percentageGevuld());
        System.out.println(bierVat.isVol());
        bierVat.tap(15);
        System.out.println(bierVat.percentageGevuld());
        System.out.println(bierVat.isVol());
    }
}
