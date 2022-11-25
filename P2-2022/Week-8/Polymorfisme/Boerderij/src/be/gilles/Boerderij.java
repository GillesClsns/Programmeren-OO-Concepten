package be.gilles;

import java.util.ArrayList;

public class Boerderij {

    ArrayList<Boerderijdier> dieren = new ArrayList<>();

    public void voegDierToe(Boerderijdier boerderijdier) {
        dieren.add(boerderijdier);
    }

    public void toonDieren() {
        for (Boerderijdier boerderijdier : dieren) {
            System.out.println(dieren);
        }
    }


}
