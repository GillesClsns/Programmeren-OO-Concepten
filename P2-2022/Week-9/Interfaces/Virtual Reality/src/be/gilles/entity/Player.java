package be.gilles.entity;

import be.gilles.interfaces.Alive;
import be.gilles.interfaces.Visible;

public class Player extends Entity implements Alive, Visible {

    private int numberOfLives;

    public Player(String naam, double[] position, int numberOfLives) {

        super(naam, position);
        this.numberOfLives = numberOfLives;

    }

    @Override
    public void kill() {

        System.out.printf("\n%s: %s", getNaam(), getNumberOfLives() <= 0 ? "is dood.." : "Aaaaaaarrrrrrgggghhh");
        if (this.numberOfLives > 0) this.numberOfLives--;

    }

    @Override
    public int getNumberOfLives() {
        return this.numberOfLives;
    }

    @Override
    public void draw() {

        System.out.println("Player: " + super.toString());

    }
}
