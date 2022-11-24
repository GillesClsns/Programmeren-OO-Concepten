import java.util.ArrayList;

public class PrimitiefObject {

    private ArrayList<Double> plaats = new ArrayList<>();

    public PrimitiefObject(double getX, double getY, double getZ) {

        plaats.add(0, getX);
        plaats.add(1, getY);
        plaats.add(2, getZ);

    }

    public PrimitiefObject() {

        plaats.add(0, 0.0);
        plaats.add(1, 0.0);
        plaats.add(2, 0.0);

    }

    public double getX() {
        return plaats.get(0);
    }

    public double getY() {
        return plaats.get(1);
    }

    public double getZ() {
        return plaats.get(2);
    }

    public double volume() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f) en volume %.2f", plaats.get(0), plaats.get(1), plaats.get(2), this.volume());
    }

}