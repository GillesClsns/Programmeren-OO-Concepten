import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        while(true) {

            for (int i = -1; i != 0; i = sc.nextInt(), total += i) {
                System.out.print("Geef een getal (stop met 0): ");
            }

            System.out.printf("""
                    De som van deze getallen is: %d
                    Einde programma!
                    Wilt u opnieuw tellen?\s (J/N) """, total);

            if(sc.next().charAt(0) != 'J') System.exit(0);

        }

    }

}

