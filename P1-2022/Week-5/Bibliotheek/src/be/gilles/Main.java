package be.gilles;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Boek> boeken = List.of(
                new Boek("Y. Daniel Liang", "Introduction to Java Programming", 1204, false),
                new Boek("Louis Paul Boon", "De Kapellekensbaan", 291, true),
                new Boek("Jef Geeraerts", "Drugs", 333, false));

        boeken.forEach(System.out::println);

    }

}