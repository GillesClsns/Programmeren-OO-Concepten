import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int population = 0;

        System.out.print("Geef de naam van het land: ");
        String country = sc.nextLine();

        while(population < 1000000) {

            System.out.printf("Hoeveel mensen wonen er in %s? ");
            population = sc.nextInt();

        }
    }
}
