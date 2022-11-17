import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Wat is je naam? ");
        String userName = sc.nextLine();

        System.out.printf("Welkom %s!", userName);

    }

}
