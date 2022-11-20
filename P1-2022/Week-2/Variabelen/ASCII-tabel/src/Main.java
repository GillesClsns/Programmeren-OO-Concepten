public class Main {

    public static void main(String[] args) {

        for (int i = 32, j = 1; i <= 127; i++, j++) {
            System.out.printf(j % 6 == 0 ? "\n" : "%s (%3d)   ", (char)i, i);
        }

    }

}
