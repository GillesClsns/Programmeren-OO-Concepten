package be.gilles;

public class Main {

    public static void main(String[] args) {

        Konijn bugs = new Konijn("Bugs", true);
        Koe belle = new Koe("Belle", 15.4);
        Konijn bunny = new Konijn("Bunny", false);
        Kip kiekens = new Kip("Generaal Kiekens", 3);
        Kip chick = new Kip("Chick", 4);
        Koe hannibal = new Koe("Hannibal", 0);

        System.out.printf("""
                %s
                %s
                %s
                %s
                %s
                %s""", bugs, belle, bunny, kiekens, chick, hannibal);

    }

}