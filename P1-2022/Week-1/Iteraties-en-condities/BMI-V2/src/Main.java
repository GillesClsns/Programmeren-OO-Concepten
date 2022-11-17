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
        System.out.printf("Je BMI is %.2f\n", userBMI);

        System.out.printf("Dat is %s", userBMI > 30
                ? "ondergewicht" : userBMI > 18 && userBMI < 25
                ? "in orde" : userBMI > 25 && userBMI < 30
                ? "overgewicht"
                : "obesitas");

    }

}
