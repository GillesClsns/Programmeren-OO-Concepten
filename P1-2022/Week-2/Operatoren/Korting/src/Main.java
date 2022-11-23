import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Geef het bedrag: ");
            int amount = sc.nextInt();
            System.out.print("Geef het aantal artikelen: ");
            int quantity = sc.nextInt();

            System.out.printf("De klant krijgt %s korting.\n\n", (amount > 150 && (quantity >= 10 && quantity <= 20)) || quantity > 100
                    ? "WEL" : "GEEN");

        }

    }

}