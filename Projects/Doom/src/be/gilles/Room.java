package be.gilles;

import java.io.Console;

public class Room {

    public final int WIDTH = 90;
    public final int HEIGHT = 20;
    private final Player player;
    private final char[][] floorPlan;

    Room(Player player) {

        this.player = player;
        floorPlan = new char[HEIGHT][WIDTH];

    }

    public boolean isFree(int x, int y) {

        return floorPlan[player.getX() + 1][player.getY() + 1] == ' ';
    }

    public boolean isFinished() {
        return player.isDeath();
    }

    public void createFloorplan() {

        for (int i = 0; i < WIDTH; i++) {
            floorPlan[0][i] = '-';
        }

        for (int i = 0; i < WIDTH; i++) {
            floorPlan[HEIGHT - 1][i] = '-';
        }

        for (int i = 0; i < HEIGHT; i++) {
            floorPlan[i][0] = '|';

        }

        for (int i = 0; i < HEIGHT; i++) {
            floorPlan[i][WIDTH - 1] = '|';
        }

        for (int i = 1; i < HEIGHT - 1; i++) {
            for (int j = 1; j < WIDTH - 1; j++) {
                floorPlan[i][j] = ' ';

            }

        }

        floorPlan[player.getX()][player.getY()] = 'P';

    }

    public void draw() {

        for (char[] plan : floorPlan) {
            System.out.println(plan);

        }

    }

    public void update() {
        player.move();
        draw();
    }

}