package be.gilles;

import static be.gilles.Main.sc;

public  class Menu {

    public static void printMenu() {

        System.out.print("""
                Conversie graden Celsius - Fahrenheit
                =====================================
                Welke conversie wens je te doen?
                1) °C naar °F
                2) °F naar °C
                Uw keuze:\s""");

        switch (sc.nextInt()) {

            case 1 -> new CelsiusToFahrenheit();


        }

    }

}