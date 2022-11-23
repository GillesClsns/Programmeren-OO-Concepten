import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int n1 = sc.nextInt();
        System.out.print("Geef nog een getal: ");
        int n2 = sc.nextInt();

        System.out.print("""
                Kies een bewerking:
                1. Optellen
                2. Aftrekken
                3. Vermenigvuldigen
                4. Delen
                Jouw keuze:\s""");

        switch(sc.nextInt()) {
            case 1 -> System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
            case 2 -> System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
            case 3 -> System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
            case 4 -> System.out.printf("%d / %d = %.2f", n1, n2, (double) n1 / n2);
            default -> throw new IllegalStateException("Unexpected value");

        }

    }

}