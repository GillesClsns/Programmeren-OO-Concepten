package be.gilles;

import java.util.ArrayList;

public class Leden {

    private final ArrayList<Lid> leden = new ArrayList<>();
    private int aantal;
    private Soort soort;

    public Leden() {
        this.aantal = 0;
    }

    public void voegLidToe(Lid lid) {
        leden.add(lid);
        aantal++;
    }

    public Lid getLid() {
        return leden.get(aantal);
    }

    public int getAantal() {

        int actieveLeden = 0;

        if (getLid().soort() != Soort.STEUNEND) {
            actieveLeden++;
        }
        return actieveLeden;
    }

    public Soort getSoort() {
        return soort;
    }

    public void printActieveLeden() {

        leden .forEach(System.out::println);
        System.out.print(getAantal());
    }

}
