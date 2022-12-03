package be.gilles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ChatBot {

    private final String naam;
    private final Random random;
    private final String[] antwoorden;

    public ChatBot(String naam) {
        this.naam = naam;
        random = new Random();
        antwoorden = new String[]{"Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"};
    }

    @Override
    public String toString() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("""
                %s
                Hallo, ik ben chatbot %s, stel me een vraag
                en ik geef je een oplossing!
                Tik "stop" om te eindigen.
                """, date.format(LocalDateTime.now()), this.naam);
    }

    public String antwoordOpVraag(String vraag) {
        return vraag.contains("stop") ? "Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van Veronica"
                : vraag.length() < 4 ? ""
                : antwoorden[random.nextInt(antwoorden.length)];
    }

}
