import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double intensity = 0;

        System.out.println("Deze applicatie berekent je ideale trainingshartslag " +
                "aan de hand van de formule van Karvonen.");

        System.out.print("Geef je leeftijd: ");
        int userAge = sc.nextInt();
        System.out.print("Geef je hartslag in rust: ");
        int hrRest = sc.nextInt();
        int hrMax = Math.abs(userAge - 220);

        System.out.print("""
                Welk soort training wil je doen?
                1 : Recuperatie training
                2 : LSD training (Long Slow Distance)
                3 : Extensieve uithouding
                4 : Intensieve uithouding
                5 : Tempo-interval
                6 : Intensieve interval
                Maak je keuze:\s""");

        switch (sc.nextInt()) {
            case 1 -> intensity = 65;
            case 2 -> intensity = 70;
            case 3 -> intensity = 75;
            case 4 -> intensity = 85;
            case 5 -> intensity = 90;
            case 6 -> intensity = 95;
        }

        double hrIdeal = hrRest + (hrMax - hrRest) * (intensity / 100);

        System.out.printf("""
                Je maximale hartslag is %d.
                Je traint best met een hartslag rond de %.0f.""", hrMax, hrIdeal);

    }

}
