package be.gilles;

import be.gilles.dieren.Hond;
import be.gilles.dieren.Kanarie;
import be.gilles.dieren.Konijn;

public class Main {

    public static void main(String[] args) {

        Hond hond = new Hond("Blackie", "Duitse herder");
        Kanarie kanarie = new Kanarie("Flippie", 15);
        Konijn konijn = new Konijn("Flappie", 12);
        //System.out.println("naam dier = " + huisdier.getNaam());
        System.out.println("naam hond = " + hond.getNaam());
        System.out.println("#poten hond = " + hond.getAantalPoten());
        System.out.println("#poten kanarie = "
                + kanarie.getAantalPoten());
        kanarie.maakGeluid(); // "twiet"
        hond.maakGeluid(); // "blaf"
        konijn.spring(); // "Flappie springt met zijn 4 poten"


    }
}
