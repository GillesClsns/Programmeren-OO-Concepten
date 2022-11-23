package be.gilles;

public class AfgerondeRechthoek extends Rechthoek {

    private int straal;

    public AfgerondeRechthoek(int lengte, int breedte, int straal) {
        super(lengte, breedte);
        this.straal = straal;

    }

    @Override
    public int oppervlakte() {
        return (int) (Math.pow(straal, 2) * Math.PI);
    }

    @Override
    public int omtrek() {
        //return (int) ((straal * straal) * Math.PI) * 4;
        return (int) (2 * (getLengte() - 2 * straal) + 2 * (getBreedte() - 2 * straal) + 2 * Math.PI * straal);
    }

    public int getStraal() {
        return straal;
    }

    public void setStraal(int straal) {
        this.straal = straal;
    }
}
