package be.gilles;

public class Main {

    public static void main(String[] args) {

        Boek boek1 = new Boek("Y. Daniel Liang", "Introduction to Java Programming", 1204, false);
        Boek boek2 = new Boek("Louis Paul Boon", "De Kapellekensbaan", 291, true);
        Boek boek3 = new Boek("Jef Geeraerts", "Drugs", 333, false);

        System.out.println(boek1 + "" + boek2 + "" + boek3);

    }

}