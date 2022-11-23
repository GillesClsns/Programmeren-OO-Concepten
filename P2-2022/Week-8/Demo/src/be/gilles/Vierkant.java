package be.gilles;

public class Vierkant extends Rechthoek {

    private int zijde;

    public Vierkant(int zijde) {
        super(zijde, zijde);

    }


    public int getZijde() {
        return zijde;
    }

    public void setZijde(int zijde) {
        this.zijde = zijde;
    }
}
