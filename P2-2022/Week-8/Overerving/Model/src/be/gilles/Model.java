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

    public void setAdres(Adres adres) {
    }

    public Adres getAdres() {
        return adres;
    }

    public Maten getMaten() {
        return maten;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Adres: %s
                Maten: %s
                """, getNaam(), this.adres != null ? getAdres() : "adres onbekend", getMaten());
    }


}
