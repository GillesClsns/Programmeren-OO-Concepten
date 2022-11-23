package be.gilles;

public class Model extends Persoon {

    Maten maten;
    Adres adres;

    public Model(String naam, int borst, int heup, int taille) {
        super(naam);
        this.maten = new Maten();
    }

    public Model(String naam) {
        super(naam);

    }

    public int getBorstomtrek() {
        return maten.getBorstomtrek();
    }

    public int getHeupomtrek() {
        return maten.getHeupomtrek();
    }

    public int getTaille() {
        return maten.getTaille();
    }

    public void setAdres(String straatNr, int postNr) {
        adres.setStraatNr(straatNr);
        adres.setPostNummer(postNr);
    }

    @Override
    public String toString() {
        return "Model{" +
                "maten=" + maten +
                ", adres=" + adres +
                '}';
    }

}
