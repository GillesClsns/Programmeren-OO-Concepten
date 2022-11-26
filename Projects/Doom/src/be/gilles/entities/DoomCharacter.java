package be.gilles.entities;

import java.util.Random;

public class DoomCharacter {

    private int x;
    private int y;

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

    public void move() {

        int moveX = new Random().nextInt(-1, 2);
        int moveY = new Random().nextInt(-1, 2);

        //if (room.isFree(getX() + moveX, getY() + moveY)) {

            this.x += moveX;
            this.y += moveY;


        }


}

