package be.gilles.entity;

import be.gilles.interfaces.Movable;
import be.gilles.interfaces.Visible;

public class Table extends Entity implements Visible, Movable {

    public Table(String naam, double[] position) {

        super(naam, position);

    }

    @Override
    public void move(double[] cords) {

        this.position[0] += cords[0];
        this.position[1] += cords[1];
        this.position[2] += cords[2];

    }

    @Override
    public void draw() {
        System.out.println("Table: " + super.toString());
    }

}
