import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortedag: "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortemaand: "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortejaar: "));

        LocalDate birthYear = LocalDate.of(year, month, day);
        DayOfWeek dayOfBirth = LocalDate.of(year, month, day).getDayOfWeek();

        year = Period.between(LocalDate.now(), birthYear).getYears();
        month = Period.between(LocalDate.now(), birthYear).getMonths();
        day = Period.between(LocalDate.now(), birthYear).getDays();

        JOptionPane.showMessageDialog(null, String.format("Je bent nu %d jaren %d maanden en %d dagen oud.\nJe bent geboren op een %s.",
                Math.abs(year), Math.abs(month), Math.abs(day), dayOfBirth.toString().toLowerCase()));

    }

}