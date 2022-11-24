package be.gilles;

public class Main {

    public static void main(String[] args) {

        Klant klant1 = new Klant("Bianca Peeters", new ContactGegevens("bianca.pieters@thuis.com", "", "0478/65.25.86"), 201879);
        Klant klant2 = new Klant("Genesis Kiliç", new ContactGegevens("genesis.kilic@home.com", "03/287.89.75", ""), 987968);
        Klant klant3 = new Klant("Robin Dwořak", new ContactGegevens("robin.dworak@dum.com", "03/579.87.99", "0436/85.77.35.11"), 166789);

        Partner partner1 = new Partner("Lucca Verstraete", new ContactGegevens("lucca.verstraete@bedrijf.com", "09/157.99.14", ""), "BE15799318");
        Partner partner2 = new Partner("Raf Ghazi", new ContactGegevens("raf.ghazi@firma.com", "015/87.77.33", "0433/33.55.78"), "BE87986469");

        System.out.printf("""
                %s
                %s
                %s
                %s
                %s""", klant1, klant2, klant3, partner1, partner2);

    }

}