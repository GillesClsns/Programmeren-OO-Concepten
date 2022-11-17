import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Geef het BTW percentage: ");
            int percentage = sc.nextInt();
            System.out.print("Geef het bedrag in €: ");
            double amount = sc.nextDouble();

            System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");

            switch (sc.nextInt()) {

                case 1 -> {
                    double btw = amount * (percentage / amount);
                    System.out.printf("€%.1f + %.1f%% BTW = €%.1f", amount - btw, (double) percentage, amount);
                }

                case 2 -> {
                    double btw = amount * (percentage / 100);
                    System.out.printf("€%.1f + %.1f%% BTW = €%.1f", amount, (double) percentage, amount + btw);
                }

                default -> System.out.println("Foutieve keuze!");

            }

        }

    }

}
