package be.gilles;

import java.util.Objects;

public class ContactGegevens {

    private final String email;
    private final String vasteTelefoon;
    private final String mobieleTelefoon;

    public ContactGegevens(String email, String vasteTelefoon, String mobieleTelefoon) {

        this.email = email;
        this.vasteTelefoon = vasteTelefoon;
        this.mobieleTelefoon = mobieleTelefoon;

    }

    public String getEmail() {
        return email;
    }

    public String getVasteTelefoon() {
        return vasteTelefoon;
    }

    public String getMobieleTelefoon() {
        return mobieleTelefoon;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", email,
                Objects.equals(vasteTelefoon, "")
                        ? "geen vast nummer" : vasteTelefoon + " (V)",
                Objects.equals(mobieleTelefoon, "")
                        ? "geen mobiel nummer" : mobieleTelefoon + " (M)");
    }

}