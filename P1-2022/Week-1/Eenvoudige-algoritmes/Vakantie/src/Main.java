import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel heeft Yousra uitgegeven? ");
        double yousra = sc.nextDouble();
        System.out.print("Hoeveel heeft Quinten uitgegeven? ");
        double quinten = sc.nextDouble();
        System.out.print("Hoeveel heeft Gilles uitgegeven?");
        double gilles = sc.nextDouble();

        double totalExpenses = yousra + quinten + gilles;
        System.out.printf("In totaal werd er %.2f EUR uitgegeven.\n", totalExpenses);
        double totalPerInstance = totalExpenses / 3;
        System.out.printf("Dat is %.3f EUR per persoon\n", totalPerInstance);

        double debtQuinten = totalPerInstance - quinten;
        double debtGilles = totalPerInstance - gilles;
        double debtYousra = totalPerInstance - yousra;

        if (yousra > quinten && yousra > gilles) {
            System.out.printf("""
                            Quinten moet dus %.3f EUR betalen aan Yousra
                            Gilles moet dus %.3f EUR betalen aan Yousra""", debtQuinten, debtGilles);
        } else if (quinten > yousra && quinten > gilles) {
            System.out.printf("""
                            Yousra moet dus %.3f EUR betalen aan Quinten
                            Gilles moet dus %.3f EUR betalen aan Yousra""", debtYousra, debtGilles);
        } else if (gilles > yousra && gilles > quinten) {
            System.out.printf("""
                            Yousra moet dus %.3f EUR betalen aan Yousra
                            Quinten moet dus %.3f EUR betalen aan Gilles""", debtYousra, debtQuinten);
        } else {
            System.out.println("Het is eerlijk verdeeld.");
        }

    }

}