import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Aantal kinderen <1m: ");
        int baby = sc.nextInt();
        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        int child = sc.nextInt();
        System.out.print("Aantal volwassenen: ");
        int adult = sc.nextInt();
        System.out.print("Aantal senioren (55+): ");
        int senior = sc.nextInt();

        double price = (child * 26) + (adult * 31) + (senior * 15.5);
        double payees = (child + adult + senior);

        double discount = payees >= 10
                ? price * 0.1 : senior == 2 && child > 0 || baby > 0
                ? (child * 26.0) / 2 : 0;

        System.out.printf("""
                *******************************
                * Welkom in het pretpark! *
                *******************************
                * Prijs: %.2f EUR
                * Grootouderkorting: -%.2f EUR
                * Totaal: %.2f EUR
                **************************************""", price, discount, price - discount);

    }

}