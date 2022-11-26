package be.gilles.entities;

import be.gilles.level.Room;

public class Player extends DoomCharacter {

    public final double START_HEALTH = 9;
    public double health;
    public Room room;

    public Player(int x, int y) {

        super(x, y);
        health = START_HEALTH;

    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Boolean isDeath() {
        return health <= 0;
    }

    @Override
    public String toString() {
        return "P";
    }

}