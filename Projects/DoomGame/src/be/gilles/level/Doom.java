package be.gilles.level;

import be.gilles.entity.Monster;
import be.gilles.entity.Player;

import java.util.ArrayList;
import java.util.Random;

import static be.gilles.util.Color.*;

public class Doom {

    protected Room room;
    private final int AMOUNT_OF_MONSTERS = 50;

    Player player = new Player(10, 5);
    ArrayList<Monster> monsters = new ArrayList<>();

    public Doom() {

        // Generating monsters at random coordinates
        for (int i = 0; i < AMOUNT_OF_MONSTERS; i++) {

            int rndX = new Random().nextInt(1, 20 - 1);
            int rndY = new Random().nextInt(1, 90 - 1);

            monsters.add(new Monster(rndX, rndY, player));

        }

        // Assigning players and monsters to their room
        this.room = new Room(player, monsters);
        player.setRoom(room);

        for (Monster x : monsters) {
            x.getPlayer().setRoom(room);

        }

    }

    public boolean isFinished() {
        return room.isFinished();
    }

    protected void showInfo() {

        System.out.println(ANSI_RED + "Health: " + room.getPlayer().getHealth() + ANSI_GREEN);
        player.printPlayerCords();

    }

    public void start() {

        while (!isFinished()) {

            try {

                Thread.sleep(500);
                room.update();
                room.draw();
                showInfo();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}