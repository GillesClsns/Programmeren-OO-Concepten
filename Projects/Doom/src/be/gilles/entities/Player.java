package be.gilles.entities;

public class Player extends DoomCharacter {

    public final double START_HEALTH = 9;
    private double health = START_HEALTH;

    public Player(int x, int y) {

        super(x, y);

    }

    public double getHealth() {
        return health;
    }

    public Boolean isDeath() {
        return health <= 0;
    }

    @Override
    public String toString() {
        return "P";
    }

}