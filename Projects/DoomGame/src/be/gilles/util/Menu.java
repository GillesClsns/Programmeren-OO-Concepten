package be.gilles.util;

import java.util.Scanner;

public class Menu {

    // TODO: 27/11/2022 Menu afmaken.

    static Scanner sc = new Scanner(System.in);

    public static void showDefaultMenu() {

        clearConsole();

        System.out.print("""
                Welkom op deze DOOM simulatie
                =============================
                Maak je keuze:
                                
                (1) Settings
                (2) Start
                (3) Exit
                """);

        System.out.print("Uw keuze: ");

        switch (sc.nextInt()) {
            case 1 -> showSettings();
            default -> throw new IllegalStateException("x");
        }

    }

    public static void showSettings() {

        clearConsole();
        System.out.print("""
                DOOM Settings
                ==============
                Wat wil je aanpassen?
                (1) Room settings
                (2) Entity settings
                (3) Advanced settings
                (4) Back to main menu
                Uw keuze:\s""");

        switch(sc.nextInt()) {

            case 1 -> showRoomSettings();
            case 4 -> showDefaultMenu();

        }

    }

    public static void showRoomSettings() {

        clearConsole();

        // Header
        System.out.print("""
                Room Settings
                =============""");

        System.out.print("Game width: ");




    }

    public static void clearConsole() {

        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }

}
