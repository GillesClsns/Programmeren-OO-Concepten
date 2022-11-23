package be.gilles;

public class ContactGegevens {

    private final String email;
    private final Telefoonnummer vasteTelefoon;
    private final Telefoonnummer mobieleTelefoon;

    public ContactGegevens(String email, Telefoonnummer vasteTelefoon, Telefoonnummer mobieleTelefoon) {
        this.email = email;
        this.vasteTelefoon = vasteTelefoon;
        this.mobieleTelefoon = mobieleTelefoon;
    }

    public String getEmail() {
        return email;
    }

    public Telefoonnummer getVasteTelefoon() {
        return vasteTelefoon;
    }

    public Telefoonnummer getMobieleTelefoon() {
        return mobieleTelefoon;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", email, vasteTelefoon, mobieleTelefoon);
    }
}
