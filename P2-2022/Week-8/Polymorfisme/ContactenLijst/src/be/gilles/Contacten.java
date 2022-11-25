package be.gilles;

import java.util.ArrayList;

public class Contacten {

    ArrayList<Contact> contacten = new ArrayList<>();

    public int getAantal() {
        return contacten.size();
    }

    public void voegContactToe(Contact contact) {
        contacten.add(contact);
    }

    public void verwijderContact(int index) {
        contacten.remove(index);
    }

    public void printContacten() {

        for (Contact contact : contacten) {

            System.out.println(contact);

        }

    }

}