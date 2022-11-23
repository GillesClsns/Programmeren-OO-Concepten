import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long population = 0;
        final int GEMIDDELDE_CALORIEEN = 2256;
        final int CALORIEEN_IN_PIZZA = 906;

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef de naam van het land: ");
        String country = sc.nextLine();

        while (String.valueOf(population).length() < 7) {

            System.out.printf("Hoeveel mensen wonen er in %s? ", country);
            population = sc.nextInt();

            if(String.valueOf(population).length() > 7) break;
            else System.out.println("Fout! Dit getal is veel te klein!");

        }

        long totalCalories = population * GEMIDDELDE_CALORIEEN;
        long totalPizza = totalCalories / CALORIEEN_IN_PIZZA;

        System.out.printf("""
                In %s verbruiken alle inwoners samen %d caloriën per dag.
                Dat komt overeen met %d pizza's per dag.""", country, totalCalories, totalPizza);

    }

}