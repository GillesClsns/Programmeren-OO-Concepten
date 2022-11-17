import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int AMOUNT = 3;
        int[] numbers = new int[AMOUNT];

        for (int i = 0; i < AMOUNT; i++) {

            System.out.print("Geef een getal (1..100): ");
            int input = sc.nextInt();

            if (input < 1 || input > 100) {
                System.out.println("Het getal moet tussen 1 en 100 liggen!");
                i--;
            } else numbers[i] = input;

        }

        Arrays.sort(numbers);
        System.out.printf("Het middelste getal is %d.\nEinde programma!", numbers[numbers.length / 2]);

    }

}