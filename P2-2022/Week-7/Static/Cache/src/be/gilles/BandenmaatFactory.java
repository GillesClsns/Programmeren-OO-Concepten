package be.gilles;

public class BandenmaatFactory {

    private static final Bandenmaat[] bandenmaatCache = new Bandenmaat[100];
    private static int aantal = 0;

    // Static factory method
    public static Bandenmaat maak(int breedte, int aspect, int velgDiameter) {

        for (int i = 0; i < aantal; i++) {

            if ((bandenmaatCache[i].breedte() == breedte) &&
                    (bandenmaatCache[i].aspect() == aspect) &&
                    (bandenmaatCache[i].velgDiameter() == velgDiameter)) {

                return bandenmaatCache[i];

            }

        }

        Bandenmaat bandenmaat = new Bandenmaat(breedte, aspect, velgDiameter);
        bandenmaatCache[aantal] = bandenmaat;
        aantal++;
        return bandenmaat;

    }

}