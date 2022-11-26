package be.gilles.level;

import be.gilles.entities.hostile.Monster;
import be.gilles.entities.Player;

import static be.gilles.util.Color.*;

public class Room {

    public final int WIDTH = 90;
    public final int HEIGHT = 20;

    public Player player;
    public Monster[] monsters;

    public char[][] floorPlan;

    public Room(Player player, Monster[] monsters) {

        this.player = player;
        this.monsters = monsters;
        this.floorPlan = new char[HEIGHT][WIDTH];

    }

    public Player getPlayer() {
        return player;
    }

    public boolean isFree(int x, int y) {
        return floorPlan[x][y] == ' ';
    }

    public boolean isFinished() {
        return player.isDeath();
    }

    public void createFloorplan() {

        for (int i = 0; i < WIDTH; i++) {

            char space = i % 2 == 0 ? '-' : ' ';
            floorPlan[0][i] = space;

        }

        for (int i = 0; i < WIDTH; i++) {

            char space = i % 2 == 0 ? '-' : ' ';
            floorPlan[HEIGHT - 1][i] = space;

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

        char playerIcon = player.toString().charAt(0);
        char monsterIcon = monsters[0].toString().charAt(0);

        floorPlan[getPlayer().getX()][getPlayer().getY()] = playerIcon;
        floorPlan[monsters[0].getX()][monsters[0].getY()] = monsterIcon;

    }

    public void draw() {

        System.out.print(ANSI_GREEN);

        for (char[] plan : floorPlan) {

            System.out.println(plan);

        }

    }

    public void update() {

        floorPlan[player.getX()][player.getY()] = ' ';
        player.move();
        createFloorplan();

    }

}