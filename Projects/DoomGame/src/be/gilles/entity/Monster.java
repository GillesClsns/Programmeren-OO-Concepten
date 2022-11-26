package be.gilles.entity;

import be.gilles.level.Room;

public class Monster extends Character {

    public final int STRENGTH;
    protected Player player;
    protected Room room;

    public Monster(int x, int y, Player player) {

        super(x, y);
        this.player = player;
        STRENGTH = 1;

    }

    public Player getPlayer() {
        return player;
    }

    public void attackPlayer() {

        if (Math.abs(getPlayer().getX() - this.getX()) <= 1 && (Math.abs(getPlayer().getY() - this.getY()) <= 1)) player.attack(STRENGTH);

    }

    @Override
    public String toString() {
        return "M";
    }

}