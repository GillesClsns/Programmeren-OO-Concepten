package be.gilles.entity;

import be.gilles.interfaces.Visible;

public class Room extends Entity implements Visible {

    public Room(String naam, double[] position) {

        super(naam, position);

    }

    @Override
    public void draw() {
        System.out.println("Room: " + super.toString());
    }

}
