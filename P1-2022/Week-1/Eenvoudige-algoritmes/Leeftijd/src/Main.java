import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Wat is je naam? ");
        String userName = sc.nextLine();
        System.out.printf("Beste %s, geef je geboortejaar: ", userName);
        int userBirthYear = sc.nextInt();

        int userAge = LocalDateTime.now().getYear() - userBirthYear;
        System.out.printf("Als alles goed loopt word je dit jaar %d.", userAge);

    }

}