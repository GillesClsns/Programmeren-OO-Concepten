import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Beste patient, dit programma berkent je BMI.");

        System.out.print("Geef je gewicht in kilogram: ");
        int userWeight = sc.nextInt();
        System.out.print("Geef je lengte in meters: ");
        double userLength = sc.nextDouble();

        double userBMI = userWeight / Math.pow(userLength, 2);
        System.out.printf("Je BMI is %.2f", userBMI);

    }

}
