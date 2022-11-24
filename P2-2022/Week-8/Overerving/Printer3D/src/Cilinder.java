public class Cilinder extends PrimitiefObject {

    private final double straal;
    private final double hoogte;

    public Cilinder(double getX, double getY, double getZ, double straal, double hoogte) {
        super(getX, getY, getZ);
        this.straal = straal;
        this.hoogte = hoogte;
    }

    public double getStraal() {
        return straal;
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public double volume() {
        return Math.PI * (Math.pow(getStraal(), 2)) * (getHoogte());
    }

    @Override
    public String toString() {
        return String.format("Cilinder met straal %.1f en hoogte %.1f op plaats (%.1f, %.1f, %.1f) en volume %.2f", getStraal(), getHoogte(), getX(), getY(), getZ(), this.volume());
    }

}