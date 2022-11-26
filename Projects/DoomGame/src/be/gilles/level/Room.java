package be.gilles.level;

import be.gilles.entity.Player;

public class Room {

    public final int WIDTH = 90;
    public final int HEIGHT = 20;

    protected Player player;
    protected char[][] floorPlan;

    public Room(Player player) {

        this.player = player;
        this.floorPlan = new char[HEIGHT][WIDTH];
        player.setRoom(this);
        createFloorplan();

    }

    public Player getPlayer() {
        return player;
    }

    protected void createFloorplan() {

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
        return this.floorPlan[x][y] == ' ';
    }

    public boolean isFinished() {
        return this.player.isDeath();
    }

    public void update() {

        floorPlan[player.getX()][player.getY()] = ' ';
        this.player.move();
        this.floorPlan[player.getX()][player.getY()] = player.toString().charAt(0);

    }

}
