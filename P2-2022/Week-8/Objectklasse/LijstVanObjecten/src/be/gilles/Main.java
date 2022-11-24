package be.gilles;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Lijst lijst = new Lijst();
        lijst.voegToe("Hallo");
        lijst.voegToe(LocalDate.now());
        lijst.voegToe(new Random());
        lijst.voegToe(new int[]{1, 2, 3});
        lijst.voegToe(new Rechthoek(10, 20));

        for (int i = 0; i < lijst.getAantal(); i++) {

            System.out.println(lijst.zoek(i));

        }

    }

}
