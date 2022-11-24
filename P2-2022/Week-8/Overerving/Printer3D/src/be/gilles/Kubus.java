package be.gilles;

public class Kubus extends Balk {

    public Kubus(double getX, double getY, double getZ, double breedte) {

        super(getX, getY, getZ, breedte, breedte, breedte);

    }

    @Override
    public String toString() {
        return String.format("Kubus met zijde %.1f op plaats (%.1f, %.1f, %.1f) en volume %.2f", getBreedte(), getX(), getY(), getZ(), super.volume());
    }

}