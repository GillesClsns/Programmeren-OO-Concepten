package be.gilles;

public class Main {

    public static void main(String[] args) {

        Btw btw = new Btw();
        btw.setPercentage(6);

        double bedrag = btw.voegBtwBij(100);
        System.out.println("Het bedrag met BTW is: " + bedrag);

        bedrag = btw.neemBtwWeg(106);
        System.out.println("Het bedrag zonder BTW is: " + bedrag);

    }

}
