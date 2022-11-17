import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef een zin: ");
        String input = sc.nextLine();

        System.out.printf("""
                ______________________
                < %s >
                ----------------------
                     \\   ^__^
                      \\  (oo)\\_______
                         (__)\\       )\\/\\
                          U ||----w |
                            ||      ||""", input);

    }

}
