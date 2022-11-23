package be.gilles;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kaart> kaarten = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            kaarten.add(new Kaart());
            System.out.print(kaarten.get(i));

        }

    }

}