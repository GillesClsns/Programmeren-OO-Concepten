package be.gilles.entities.hostile;

import be.gilles.entities.DoomCharacter;
import be.gilles.entities.Player;

public class Monster extends DoomCharacter {

    public final int STRENTH = 1;
    protected Player player;

    public Monster(int x, int y, Player player) {

        super(x, y);
        this.player = player;

    }

    private Player getPlayer() {
        return player;
    }

    private void attackPlayer() {



    }

    @Override
    public String toString() {
        return "M";
    }

}