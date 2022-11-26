package be.gilles.level;

import be.gilles.entity.hostile.Follower;
import be.gilles.entity.hostile.Monster;
import be.gilles.entity.Player;
import be.gilles.entity.hostile.SimpleMonster;
import be.gilles.entity.hostile.TimeBomb;

import java.util.ArrayList;

public class Room {

    public final int WIDTH = 90;
    public final int HEIGHT = 20;

    protected Player player;
    protected char[][] floorPlan;
    protected ArrayList<SimpleMonster> monsters;

    public TimeBomb timeBomb;

    public Room(Player player, ArrayList<SimpleMonster> monsters, TimeBomb timeBomb) {

        this.player = player;
        this.monsters = monsters;
        createFloorplan();
        this.timeBomb = timeBomb;

    }

    public Player getPlayer() {
        return player;
    }

    protected void createFloorplan() {

        this.floorPlan = new char[HEIGHT][WIDTH];

        // TOP
        for (int i = 0; i < WIDTH; i++) {
            char space = i % 2 == 0 ? '-' : ' ';
            this.floorPlan[0][i] = space;
        }

        // BOTTOM
        for (int i = 0; i < WIDTH; i++) {
            char space = i % 2 == 0 ? '-' : ' ';
            this.floorPlan[HEIGHT - 1][i] = space;
        }

        // LEFT
        for (int i = 0; i < HEIGHT; i++) {
            this.floorPlan[i][0] = '|';
        }

        // RIGHT
        for (int i = 0; i < HEIGHT; i++) {
            this.floorPlan[i][WIDTH - 1] = '|';
        }

        // SPACES
        for (int i = 1; i < HEIGHT - 1; i++) {
            for (int j = 1; j < WIDTH - 1; j++) {
                this.floorPlan[i][j] = ' ';
            }

        }

    }

    public void draw() {

        for (char[] frame : this.floorPlan) {

            System.out.println(frame);
        }

    }

    public boolean isFree(int x, int y) {
        return this.floorPlan[x][y] == ' ' && (x != 0 && x != HEIGHT - 1); // Ensures that no entity can spawn outside the gameframe.
    }

    public boolean isFinished() {
        return this.player.isDeath();
    }

    public void update() {

        floorPlan[player.getX()][player.getY()] = ' '; // Replace old location with a space

        this.player.move();
        this.floorPlan[player.getX()][player.getY()] = player.toString().charAt(0); // Move player and print character

        // Make the monsters move in the game
        for (SimpleMonster x : monsters) {

            x.setRoom(this); // Assigning the monsters to the room

            this.floorPlan[x.getX()][x.getY()] = ' '; // Replace old location with  a space

            x.move();
            this.floorPlan[x.getX()][x.getY()] = x.toString().charAt(0); // Move monsters and print character

        }

        floorPlan[timeBomb.getX()][timeBomb.getY()] = ' ';
        this.timeBomb.move();
        this.floorPlan[timeBomb.getX()][timeBomb.getY()] = timeBomb.toString().charAt(0); // Move player and print character

        // Ensures that the monsters attack the players
        for (SimpleMonster x : monsters) {
            x.attackPlayer();

        }

    }

}