import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef een string in: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.printf("%c heeft een codepoint gelijk aan %d\n", s.charAt(i), (int) s.charAt(i));
        }

    }

}
