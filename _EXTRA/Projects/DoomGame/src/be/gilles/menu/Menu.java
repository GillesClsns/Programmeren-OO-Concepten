package be.gilles.menu;

import java.util.Scanner;

import static be.gilles.menu.SettingsMenu.showSettings;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void clearConsole() {

        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void showDefaultMenu() {

        clearConsole();

        System.out.print("""
                Welkom op deze DOOM simulatie
                =============================
                Maak je keuze:
                                
                (1) Settings
                (2) Start
                (3) Exit
                Uw keuze:\s""");


        switch (sc.nextInt()) {

            case 1 -> showSettings();
            case 2 -> System.out.println();
            case 3 -> System.exit(0);
            default -> throw new IllegalStateException("Unexpected value.");

        }

    }

}
