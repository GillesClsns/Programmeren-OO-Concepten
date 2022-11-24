package be.gilles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Player {

    private final int START_HEALTH = 9;
    private double health;
    private int x;
    private int y;
    private Random random;
    private Room room;

    public Player(int x, int y) {

        this.x = x;
        this.y = y;

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

    public Boolean isDeath() {
        return health <= 0;
    }

    public void move() {

        this.x += new Random().nextInt(-1, 2);
        this.y += new Random().nextInt(-1, 2);

    }

    @Override
    public String toString() {
        return "P";
    }

}