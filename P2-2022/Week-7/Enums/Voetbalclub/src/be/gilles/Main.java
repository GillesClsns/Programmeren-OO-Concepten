package be.gilles;

import static be.gilles.Soort.*;

public class Main {

    public static void main(String[] args) {

        Leden leden = new Leden();

        leden.voegLidToe(new Lid(1001, "Luka", GEWOON));
        leden.voegLidToe(new Lid(1002, "Gevorg", ERELID));
        leden.voegLidToe(new Lid(1003, "Lorenzo", STEUNEND));
        leden.voegLidToe(new Lid(1004, "Pavel", GEWOON));
        leden.voegLidToe(new Lid(1005, "Sarah", GEWOON));
        leden.voegLidToe(new Lid(1006, "Noam", ERELID));

        leden.printActieveLeden();

    }
}
