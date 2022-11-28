import be.gilles.level.Doom;
import be.gilles.menu.Menu;

public class Main {

    public static void main(String[] args) {

        Doom doom = new Doom();
        Menu.showDefaultMenu();
        doom.start();

    }

}