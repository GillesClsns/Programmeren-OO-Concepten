import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {

            int dif = 0;

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

            System.out.printf("De afstand tussen \"%s\" en \"%s\" is %d.\n\n", min, max, Math.abs(dif));

        }

    }

}