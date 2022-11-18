import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int day = sc.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int month = sc.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int year = sc.nextInt();

        LocalDate birthYear = LocalDate.of(year, month, day);
        long day2 = Period.between(LocalDate.now(), birthYear).getDays();
        System.out.printf("Je bent vandaag %d dagen oud.", day2);

    }
}
