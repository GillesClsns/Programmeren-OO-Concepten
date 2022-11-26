import be.gilles.Lid;

public class Main {

    public static void main(String[] args) {

        final Lid[] leden = new Lid[6];
        final String[] namen = new String[]{
                "Murtadha", "Bart", "Alikhan", "Emma", "Bo", "Dachi"};

        for (int i = 0; i < leden.length; i++) {
            leden[i] = new Lid(namen[i]);
        }

        for (Lid x : leden) {
            System.out.println(x);
        }

        System.out.println("Het volgende lidnummer is: " + Lid.getVolgendlid());

    }

}