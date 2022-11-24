public class Bol extends  PrimitiefObject {

    private final double straal;

    public Bol(double getX, double getY, double getZ, double straal) {

        super(getX, getY, getZ);
        this.straal = straal;

    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * (Math.pow(getStraal(), 3));
    }

    @Override
    public String toString() {
        return String.format("Bol met straal %.1f op plaats (%.1f, %.1f, %.1f) en volume %.2f", getStraal(), getX(), getY(), getZ(), this.volume());
    }

}