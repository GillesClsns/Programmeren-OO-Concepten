import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // Initialize the scanner for user input
        Scanner sc = new Scanner(System.in);

        // Let the user input any amount of phrases
        ArrayList<String> phrases = new ArrayList<>();
        System.out.println("Please write down some phrases\nLeave empty to continue\n");

        String input;
        while (!(input = sc.nextLine()).isBlank()) {
            phrases.add(input);
        }

        // Get the length as an int of the longest phrase and initialize Cowsay
        int l = (phrases.stream().map(String::length).max(Integer::compareTo).orElse(-1) + 2);

        // Initialize an ArrayList to store our formatted phrases
        ArrayList<String> formattedPhrases = new ArrayList<>();

        // Format the phrases by adding the required encapsulation and spacing
        if (phrases.size() == 1)
            formattedPhrases.add("< " + phrases.get(0) + " >");
        else {

            int i = 0;
            for (String phr : phrases) {

                // Add some padding to the phrase, if it has an odd length add an extra space on the right
                int pd = l - phr.length();
                String pad = " ".repeat(pd / 2);
                if (pd % 2 == 1) phr += " ";

                String formattedPhrase = pad + phr + pad;
                String symbols = i == 0 ? "/\\" : i == (phrases.size() - 1) ? "\\/" : "";

                formattedPhrases.add(i == 0 || i == (phrases.size() - 1)
                        ? symbols.charAt(0) + formattedPhrase + symbols.charAt(1) : "|" + formattedPhrase + "|");
                i++;

            }

        }

        // Initialize and finally add all components to the Cowsay variable and print it
        ArrayList<String> cowsay = new ArrayList<>();

        cowsay.add("_".repeat(l + 2));
        cowsay.addAll(formattedPhrases);
        cowsay.add("-".repeat(l + 2));

        cowsay.forEach(System.out::println);

        System.out.println("""
				\\   ^__^
				 \\  (oo)\\_______
				    (__)\\       )\\/\\
				     U ||----w |
				       ||      ||""".indent(5));

    }

}