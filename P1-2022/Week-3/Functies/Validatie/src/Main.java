import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        askInteger(5);
    }

    public static void askInteger(final int AMOUNT) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= AMOUNT; i++) {

            System.out.printf("Geef het %d de getal: ", i);
            int j = sc.nextInt();

            if (j > 100 || j % 50 == 0) list.add(j);
            else i--;

        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.printf("Het gemiddelde van deze getallen is: %d", sum / AMOUNT);

    }

}
