package be.gilles.entity;

public class Player extends Character {

    public final double START_HEALTH;
    protected double health;

    public Player(int x, int y) {

        super(x, y);
        START_HEALTH = 9;
        health = START_HEALTH;

    }

    public double getHealth() {
        return health < 0 ? 0 : health;
    }

    public void attack(double strength) {
        this.health -= strength;
    }

    public boolean isDeath() {
        return this.health <= 0;
    }

    @Override
    public String toString() {
        return "P";
    }

    // DEBUG
    public void printPlayerCords() {
        System.out.println(getX() + ", " + getY());

    }

}