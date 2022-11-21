package be.gilles;

public class Auto {

    private final String merk;
    private final String type;
    private final int fiscaalVermogen;

    public Auto(String merk, String type, int fiscaalVermogen) {
        this.merk = merk;
        this.type = type;
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public double berekenVerkeersbelasting() {

        return switch (this.fiscaalVermogen) {

            case 1, 2, 3, 4 -> 84.36;
            case 5 -> 105.60;
            case 6 -> 152.64;
            case 7 -> 199.44;
            case 8 -> 246.60;
            case 9 -> 293.76;
            case 10 -> 340.32;
            case 11 -> 441.84;
            case 12 -> 543.12;
            case 13 -> 644.16;
            case 14 -> 745.56;
            case 15 -> 846.84;
            case 16 -> 1109.28;
            case 17 -> 1371.96;
            case 18 -> 1634.52;
            case 19 -> 1896.48;
            case 20 -> 2159.04;
            default -> calculateAboveTwenty();

        };

    }
    
    public double calculateAboveTwenty() {

        double tax = 2159.04;
        for (int i = 0; i < this.fiscaalVermogen - 20; i++) {
            tax += 117.60;
        }

        return tax;
    }

    @Override
    public String toString() {
        return String.format("%s %s met %dPK. U betaalt €%.2f", this.merk, this.type, fiscaalVermogen, this.berekenVerkeersbelasting());
    }

}
