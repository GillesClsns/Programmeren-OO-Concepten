import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef de vorige kilometerstand: ");
        int prevMileage = sc.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        int currMileage = sc.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        double fuel = sc.nextDouble();

        double consumption = (fuel * 100) / (currMileage - prevMileage);

        System.out.printf("\nVerbruik voor %dkm: %.2f liter/100km", (currMileage - prevMileage), consumption);

    }

}
