import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel getallen wil je afdrukken? ");
        int printAmount = sc.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        int startAmount = sc.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        int stepCount = sc.nextInt();

        for (int i = 0, j = startAmount; i < printAmount; i++, j += stepCount) {
            System.out.printf("%d ", j);
        }

    }

}