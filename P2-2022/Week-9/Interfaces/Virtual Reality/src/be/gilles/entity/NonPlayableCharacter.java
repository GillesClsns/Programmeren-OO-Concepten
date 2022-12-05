package be.gilles.entity;

import be.gilles.interfaces.Alive;
import be.gilles.interfaces.Visible;

import java.util.Random;

public class NonPlayableCharacter extends Entity implements Alive, Visible {

    private int numberOfLives;

    public NonPlayableCharacter(String naam, double[] position, int numberOfLives) {
        super(naam, position);
        if (this.getNumberOfLives() < 1) this.numberOfLives = 1;
        else this.numberOfLives = numberOfLives;
    }

    public void animatie() {

        this.position[0] += new Random().nextInt(-10, 11);
        this.position[1] += new Random().nextInt(-10, 11);
        this.position[2] += new Random().nextInt(-10, 11);

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

        System.out.println("Non playable character: " + super.toString());

    }

}
