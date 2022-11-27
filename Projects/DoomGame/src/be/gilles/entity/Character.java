package be.gilles.entity;

import be.gilles.level.Room;

import java.util.Random;

public class Character {

    public int x;
    public int y;
    protected Room room;

    public Character(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void move() {

        int newX = new Random().nextInt(-1, 2);
        int newY = new Random().nextInt(-1, 2);

        if (room.isFree(getX() + newX, getY() + newY)) {

            this.x += newX;
            this.y += newY;

        }

    }

}