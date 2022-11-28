package be.gilles;

public class Main {

    public static void main(String[] args) {

        // Step 1
        Lid lid1 = new Lid("Kris", 123456);
        Lid lid2 = new Lid("Jan", 123456);

        if (lid1.equals(lid2)) System.out.printf("De leden %s en %s zijn gelijk\n", lid1, lid2);
        else System.out.printf("De leden %s en %s zijn niet gelijk\n", lid1, lid2);

        // Step 2
        Lid lid3 = new Bestuurslid("Piet", 456789, "penningmeester");
        Lid lid4 = new Bestuurslid("Joris", 456789, "voorzitter");

        if (lid3.equals(lid4)) System.out.printf("De leden %s en %s zijn gelijk\n", lid3, lid4);
        else System.out.printf("De leden %s en %s zijn niet gelijk\n", lid3, lid4);

        // Step 3
        Lid lid5 = new GewoonLid("Joris", 456789, "vliegtuigbouw");

        if (lid4.equals(lid5)) System.out.printf("De leden %s en %s zijn gelijk\n", lid4, lid5);
        else System.out.printf("De leden %s en %s zijn niet gelijk\n", lid4, lid5);

    }

}