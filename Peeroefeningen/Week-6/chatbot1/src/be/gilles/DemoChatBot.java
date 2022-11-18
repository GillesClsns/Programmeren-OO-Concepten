package be.gilles;

import java.util.Scanner;

public class DemoChatBot {

    public static void main(String[] args) {

        ChatBot chatbot = new ChatBot("Veronica");

        System.out.println(chatbot);

        Scanner sc = new Scanner(System.in);


        String vraag = sc.nextLine();
        chatbot.antwoordOpVraag(vraag);


    }
}
