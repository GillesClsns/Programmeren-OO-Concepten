package be.gilles.entities.hostile;

import be.gilles.entities.DoomCharacter;
import be.gilles.entities.Player;

public class Monster extends DoomCharacter {

    public final int STRENGTH = 1;
    protected Player player;

    public Monster(int x, int y) {

        super(x, y);

    }

    public Player getPlayer() {
        return player;
    }

    public void attack() {

        System.out.println(getPlayer().health);
        /*if(getPlayer().getX() - this.getX() <= 1 || getPlayer().getY() - this.getY() <= 1) {

            getPlayer().setHealth(getPlayer().getHealth() - STRENTH);

        }*/
    }

    @Override
    public String toString() {
        return "M";
    }

}