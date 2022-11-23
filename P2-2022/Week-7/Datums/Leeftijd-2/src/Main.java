import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
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
        DayOfWeek dayOfBirth = LocalDate.of(year, month, day).getDayOfWeek();

        year = Period.between(LocalDate.now(), birthYear).getYears();
        month = Period.between(LocalDate.now(), birthYear).getMonths();
        day = Period.between(LocalDate.now(), birthYear).getDays();

        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud.\nJe bent geboren op een %s.", Math.abs(year), Math.abs(month), Math.abs(day), dayOfBirth.toString().toLowerCase());

    }

}