public enum Maanden {

    JANUARI(1), FEBRUARI(2), MAART(3), APRIL(4), MEI(5), JUNI(6),
    JULI(7), AUGUSTUS(8), SEPTEMBER(9), OKTOBER(10), NOVEMBER(11), DECEMBER(12);

    private final int numVal;

    Maanden(int numVal) {
        this.numVal = numVal;
    }

    public static Maanden getMaand(int numVal) {

        for (Maanden maand : values()) {
            if (maand.numVal == numVal) return maand;
        }

        return null;

    }

}