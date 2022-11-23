package be.gilles;

public class Main {

    public static void main(String[] args) {

        Model eerste = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(eerste);

        Model tweede = new Model("Veronica", 102, 67, 88);
        tweede.setAdres("fdsqf", 2000);
        System.out.println("\nTweede model");
        System.out.println(tweede);
    }
}
