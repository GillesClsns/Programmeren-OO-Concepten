import be.gilles.level.Doom;
import be.gilles.menu.Menu;

public class Main {

    public static void main(String[] args) {

        Menu.showDefaultMenu();
        Doom doom = new Doom();
        doom.start();

    }

}