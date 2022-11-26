import be.gilles.Auto;
import be.gilles.BandenmaatFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Auto> wagens = new ArrayList<>();

        wagens.add(new Auto("renault", "clio", BandenmaatFactory.maak(185, 65, 15)));
        wagens.add(new Auto("dacia", "sandero", BandenmaatFactory.maak(185, 65, 15)));
        wagens.add(new Auto("bmw", "4 serie", BandenmaatFactory.maak(225, 35, 20)));
        wagens.add(new Auto("citroen", "c3", BandenmaatFactory.maak(185, 65, 15)));

        for (Auto x : wagens) {
            System.out.println(x);
        }

    }

}