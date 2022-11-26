package be.gilles.entity.hostile;

import be.gilles.entity.Character;
import be.gilles.entity.Player;

public abstract class Monster extends Character {

    public final int STRENGTH;
    protected Player player;

    public Monster(int x, int y, Player player) {

        super(x, y);
        this.player = player;
        STRENGTH = 1;

    }

    public abstract void attackPlayer();
    public abstract String toString();

}