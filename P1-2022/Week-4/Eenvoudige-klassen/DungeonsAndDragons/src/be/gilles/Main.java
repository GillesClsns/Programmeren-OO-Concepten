package be.gilles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dobbelsteen dobbelsteen = new Dobbelsteen();
        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel zijden? ");
        dobbelsteen.setAmountOfSides(sc.nextInt());

        dobbelsteen.gooi();

    }

}
