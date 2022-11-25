package be.gilles;

public class Main {

    public static void main(String[] args) {

        Boerderij boerderij = new Boerderij();
        boerderij.voegDierToe(new Konijn("Bugs", true));
        boerderij.voegDierToe(new Koe("Belle", 15.4));
        boerderij.voegDierToe(new Konijn("Bunny", false));
        boerderij.voegDierToe(new Kip("Generaal Kiekens", 3));
        boerderij.voegDierToe(new Kip("Chick", 4));
        boerderij.voegDierToe(new Koe("Hannibal", 0));

        System.out.println("--------\ntoonDieren:\n");
        boerderij.toonDieren();

    }

}