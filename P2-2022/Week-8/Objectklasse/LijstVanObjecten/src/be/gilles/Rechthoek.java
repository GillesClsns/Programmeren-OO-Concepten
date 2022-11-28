package be.gilles;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Rechthoek other) {
            return Objects.equals(breedte, other.breedte) &&
                    Objects.equals(lengte, other.lengte);
        }
        return false;
    }

}