package be.gilles.menu.settings;

import be.gilles.level.Room;
import be.gilles.menu.SettingsMenu;

public class Roomsettings extends SettingsMenu {

    // Default frame dimensions
    public static int roomHeight = 20;
    public static int roomWidth = 90;

    public static void showRoomSettings() {

        clearConsole();
        System.out.print("""
                Room Settings
                =============
                (1) Room size
                (2) Go back""");

        switch (sc.nextInt()) {

            case 1 -> roomSizeSettings();
            case 2 -> showSettings();

        }

    }

    public static void roomSizeSettings() {

        System.out.print("Height: ");
        roomHeight = sc.nextInt();
        System.out.print("Width: ");
        roomHeight = sc.nextInt();
        showDefaultMenu();


    }
}