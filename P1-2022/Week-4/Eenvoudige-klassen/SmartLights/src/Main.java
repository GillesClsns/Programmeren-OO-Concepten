import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lamp livingLamp = new Lamp();
        Lamp keukenLamp = new Lamp();
        Lamp slaapkamerLamp = new Lamp();

        Scanner sc = new Scanner(System.in);

        Lamp.printOperation();

        switch (sc.nextInt()) {
            case 1 -> {
                livingLamp.aan();
                keukenLamp.aan();
                slaapkamerLamp.aan();
            }
            case 2 -> {
                livingLamp.uit();
                keukenLamp.uit();
                slaapkamerLamp.uit();
            }
            case 3 -> {
                livingLamp.aan();
                keukenLamp.aan();
                slaapkamerLamp.uit();
            }
            case 4 -> {
                livingLamp.uit();
                keukenLamp.uit();
                slaapkamerLamp.aan();
            }

        }

        System.out.printf("""
                - Lamp in de living: %s
                - Lamp in de keuken: %s
                - Lamp in de slaapkamer: %s""",
                livingLamp.isToggleState(), keukenLamp.isToggleState(), slaapkamerLamp.isToggleState());

    }

}