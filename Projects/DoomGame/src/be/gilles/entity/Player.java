package be.gilles.entity;

import be.gilles.level.Room;

import javax.print.DocFlavor;
import java.util.Random;

public class Player {

    public final double START_HEALTH;
    protected double health;

    protected int x;
    protected int y;

    protected Room room;

    public Player(int x, int y) {

        this.x = x;
        this.y = y;
        START_HEALTH = 9;
        health = START_HEALTH;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getHealth() {
        return health;
    }

    public void attack(double strength) {
        this.health -= strength;
    }

    public boolean isDeath() {
        return this.health <= 0;
    }

    public void move() {

        int newX = new Random().nextInt(-1, 2);
        int newY = new Random().nextInt(-1, 2);

        if (room.isFree(getX() + newX, getY() + newY)) {

            this.x += new Random().nextInt(-1, 2);
            this.y += new Random().nextInt(-1, 2);

        }

    }

    @Override
    public String toString() {
        return "P";
    }

    // DEBUG
    public void printPlayerCords() {
        System.out.print(getX() + ", " + getY());

    }

}