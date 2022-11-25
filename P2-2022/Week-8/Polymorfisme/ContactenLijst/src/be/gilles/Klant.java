package be.gilles;

public class Klant extends Contact {

    private final int klantnummer;

    public Klant(String naam, ContactGegevens contactGegevens, int klantnummer) {

        super(naam, contactGegevens);
        this.klantnummer = klantnummer;

    }

    public int getKlantnummer() {
        return klantnummer;
    }

    @Override
    public String toString() {
        return String.format("Klant (%d): %s, %s", klantnummer, getNaam(), getContactGegevens());
    }

}