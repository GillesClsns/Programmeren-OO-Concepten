import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int n1 = sc.nextInt();
        System.out.print("Geef nog een getal: ");
        int n2 = sc.nextInt();
        System.out.print("Geef een laatste getal: ");
        int n3 = sc.nextInt();

        System.out.printf("Het product is: %d", (n1 * n2 * n3));

    }

}