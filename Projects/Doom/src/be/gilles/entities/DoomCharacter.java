package be.gilles.entities;

import be.gilles.level.Room;

import java.util.Random;

public class DoomCharacter {

    private int x;
    private int y;
    private Room room;

    public DoomCharacter(int x, int y) {

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

        int moveX = new Random().nextInt(-1, 2);
        int moveY = new Random().nextInt(-1, 2);

        //if (room.isFree(getX() + moveX, getY() + moveY)) {

            this.x += moveX;
            this.y += moveY;

        }


}

