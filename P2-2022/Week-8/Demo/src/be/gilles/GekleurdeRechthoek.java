package be.gilles;

public class GekleurdeRechthoek extends Rechthoek {

    private Kleuren kleur;

    public GekleurdeRechthoek(int lengte, int breedte, Kleuren kleur) {
        setLengte(lengte);
        setBreedte(breedte);
        setKleur(kleur);
    }

    public void setKleur(Kleuren kleur) {
        this.kleur = kleur;
    }

    public Kleuren getKleur() {
        return kleur;
    }

    @Override
    public void setLengte(int lengte) {
        super.setLengte(lengte);
        super.setBreedte(lengte);
    }

    @Override
    public void setBreedte(int breedte) {
        super.setLengte(breedte);
        super.setBreedte(breedte);
    }

}
