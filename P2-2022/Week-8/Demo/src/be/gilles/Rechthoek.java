package be.gilles;

public class Rechthoek {

    public int lengte;
    public int breedte;

    //Constructor
    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    //Default constructor
    public Rechthoek() {
        this(1, 1);
    }

    //Copy constructor
    public Rechthoek(Rechthoek rechthoek) {
        this(rechthoek.lengte, rechthoek.breedte);
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public int oppervlakte() {
        return lengte * breedte;
    }

    public int omtrek() {
        return 2 * (lengte + breedte);
    }

}
