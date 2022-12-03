package be.gilles;

public enum Smaak {

    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME, SEC, DEMI_SEC, DOUX;

    @Override
    public String toString() {
        return String.format("%s",
                name().charAt(0) + name().substring(1).toLowerCase().replace('_', '-'));
    }

}