package be.gilles;

public class Contact {

    private final String naam;
    private final ContactGegevens contactGegevens;

    public Contact(String naam, ContactGegevens contactGegevens) {

        this.naam = naam;
        this.contactGegevens = contactGegevens;

    }

    public String getNaam() {
        return naam;
    }

    public ContactGegevens getContactGegevens() {
        return contactGegevens;
    }


}