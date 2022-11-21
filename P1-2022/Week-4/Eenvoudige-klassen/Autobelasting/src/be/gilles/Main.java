package be.gilles;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Renault", "Scénic", 8);
        Auto auto2 = new Auto("Porsche", "911 GT3", 19);
        Auto auto3 = new Auto("Rolls-Royce", "Phantom", 32);

        System.out.println(auto1 + "\n" + auto2 + "\n" + auto3);

    }

}