import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jaar = 0;

        while (jaar < 1583) {

            System.out.print("Geef een jaartal: ");
            jaar = sc.nextInt();

            if (jaar < 1583) System.out.println("Het jaartal moet groter of gelijk zijn aan 1583!");

        }

        double n = jaar % 19; double c = jaar / 100.0; double u = jaar % 100;
        double s = c / 4; double t = c % 4; double p = (c + 8) / 25; double q = (c - p + 1) / 3;
        double e = (19 * n + c - s - q + 15) % 30; double b = u / 4; double d = u % 4;
        double L = (2 * t + 2 * b - e - d + 32) % 7; double h = (n + 11 * e + 22 * L) / 451;
        double maand = (e + L - 7 * h + 114) / 31; double dag = ((e + L - 7 * h + 114) % 31) + 1;
        
        String maandToText = Maanden.getMaand((int) maand).toString().toLowerCase();
        System.out.printf("In %d valt Pasen op %.0f %s", jaar, dag, maandToText);

    }

}