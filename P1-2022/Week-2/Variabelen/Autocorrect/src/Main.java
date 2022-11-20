import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dif = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String s1 = sc.next();
        System.out.print("Geef nog een woord: ");
        String s2 = sc.next();

        String min = s1.length() <= s2.length() ? s1 : s2;
        String max = s2.length() >= s1.length() ? s2 : s1;

        for (int i = 0; i < min.length(); i++) {

            dif += min.charAt(i) != max.charAt(i) ? min.charAt(i) - max.charAt(i) : 0;
        }

        for (int i = min.length(); i < max.length(); i++) {

            dif += max.charAt(i);

        }

        System.out.printf("\nDe afstand tussen \"%s\" en \"%s\" is %d.", min, max, Math.abs(dif));

        // Debugging
        System.out.println("\n\nDEBUG");
        for (int i = 0; i < min.length(); i++) {
            System.out.printf("%d ", (int) min.charAt(i));
        }

        System.out.println("");
        for (int i = 0; i < max.length(); i++) {
            System.out.printf("%d ", (int) max.charAt(i));
        }

    }

}
