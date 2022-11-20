import java.util.Scanner;

public class Lamp {

    private Boolean state;

    public Lamp() {
        this.state = false;
    }

    public Boolean getState() {
        return state;
    }

    public void aan() {
        this.state = true;
    }

    public void uit() {
        this.state = false;
    }

    public static void printOperation() {

        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Wat wil je doen?
                1  Alle lampen aan
                2  Alle lampen uit
                3  Living en keuken aan (slaapkamer gaat uit)
                4  Slaapkamer aan (living en keuken gaan uit)
                Jouw keuze:\s""");

    }

    public static void printStatus() {

        System.out.printf("""
                - Lamp in de living: %s
                - Lamp in de keuken: %s
                - Lamp in de slaapkamer: %s""");
    }

}