package be.gilles;

public class Rechthoek {

    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public String toString() {
        return String.format("Rechthoek met lengte %d en breedte %d.", lengte, breedte);
    }
}
