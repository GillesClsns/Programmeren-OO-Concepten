package be.gilles;

public class Partner extends Contact {

    private final String ondernemingsnummer;

    public Partner(String naam, ContactGegevens contactGegevens, String ondernemingsnummer) {

        super(naam, contactGegevens);
        this.ondernemingsnummer = ondernemingsnummer;

    }

    @Override
    public String toString() {
        return String.format("Partner (%s): %s, %s", ondernemingsnummer, getNaam(), getContactGegevens());
    }

}