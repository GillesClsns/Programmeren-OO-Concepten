package be.gilles;

import java.util.Scanner;

public class DemoChatBot {

    public static void main(String[] args) {

        ChatBot chatbot = new ChatBot("Veronica");
        Scanner sc = new Scanner(System.in);

        System.out.println(chatbot);

        while (true) {

            String vraag = sc.nextLine();
            System.out.println(chatbot.antwoordOpVraag(vraag));

        }

    }

}
