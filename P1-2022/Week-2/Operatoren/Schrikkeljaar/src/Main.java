import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Geef een jaartal: ");
            int year = sc.nextInt();

            System.out.printf("Het jaar %d is %s schrikkeljaar.\n", year, Year.isLeap(year) ? "een" : "geen");

        }

    }

}