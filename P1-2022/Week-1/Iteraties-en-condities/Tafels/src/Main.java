import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.print("Welke tafel wil je oefenen? ");
        int n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.printf("%d x %d = ", i, n);
            boolean valid = sc.nextInt() == (i * n);
            System.out.println(valid ? "Correct" : "Fout!");
            score = valid ? score : score + 1;

            if(!valid) i--;

        }

        System.out.printf("Je maakte %d fout(en) op de tafel van %d.", score, n);

    }

}
