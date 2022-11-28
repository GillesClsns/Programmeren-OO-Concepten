package be.gilles.menu;

import static be.gilles.menu.settings.AdvancedSettings.showAdvancedSettings;
import static be.gilles.menu.settings.EntitySettings.showEntitySettings;
import static be.gilles.menu.settings.Roomsettings.showRoomSettings;

public class SettingsMenu extends Menu {

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

        switch (sc.nextInt()) {

            case 1 -> showRoomSettings();
            case 2 -> showEntitySettings();
            case 3 -> showAdvancedSettings();
            case 4 -> showDefaultMenu();

        }

    }

}