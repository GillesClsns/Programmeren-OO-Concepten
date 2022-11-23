import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("Hoeveel lijnen moeten er getoond worden? ");

        for (int i = 0, j = sc.nextInt(); i <= j; i++) {

            System.out.print("Geef een zin: ");
            lines.add(sc.nextLine());

        }

        System.out.print("______________________");

        for (String line : lines) {

            System.out.println(line);

        }

        System.out.print("""
                ----------------------
                     \\   ^__^
                      \\  (oo)\\_______
                         (__)\\       )\\/\\
                          U ||----w |
                            ||      ||""");

    }

}