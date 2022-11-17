package be.gilles;

public enum Kaartkleur {
    HARTEN, SCHOPPEN, RUITEN, KLAVEREN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
