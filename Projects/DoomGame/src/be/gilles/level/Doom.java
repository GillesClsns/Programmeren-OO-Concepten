package be.gilles.level;

import be.gilles.entity.hostile.Follower;
import be.gilles.entity.hostile.Monster;
import be.gilles.entity.Player;
import be.gilles.entity.hostile.SimpleMonster;
import be.gilles.entity.hostile.TimeBomb;

import java.util.ArrayList;
import java.util.Random;

import static be.gilles.util.Color.*;

public class Doom {

    protected Room room;
    private final int AMOUNT_OF_MONSTERS = 1;

    Player player = new Player(10, 45);
    ArrayList<SimpleMonster> monsters = new ArrayList<>();

    int rndX = new Random().nextInt(1, 20 - 1);
    int rndY = new Random().nextInt(1, 90 - 1);
    TimeBomb timeBomb = new TimeBomb(rndX, rndY, player);


    public Doom() {

        // Generating SimpleMonsters at random coordinates
        for (int i = 0; i < AMOUNT_OF_MONSTERS; i++) {

            int rndX = new Random().nextInt(1, 20 - 1);
            int rndY = new Random().nextInt(1, 90 - 1);

            monsters.add(new SimpleMonster(rndX, rndY, player));
            monsters.add(new Follower(rndX, rndY, player));


        }


        // Assigning players and monsters to their room
        this.room = new Room(player, monsters, timeBomb);
        player.setRoom(room);
        timeBomb.setRoom(room);

        for (SimpleMonster x : monsters) {
            x.setRoom(room);

        }

    }

    public boolean isFinished() {
        return room.isFinished();
    }

    protected void showInfo() {

        System.out.println(ANSI_GREEN + "Health: " + room.getPlayer().getHealth() + ANSI_RESET);

        //player.printPlayerCords(); For debugging purposes

    }

    public void start() {

        while (!isFinished()) {

            try {

                Thread.sleep(0);
                room.update();

                if (player.isDeath()) System.out.println(ANSI_RED + """
                        I'm death!
                        Aaarrgh....""" + ANSI_RESET);

                room.draw();
                showInfo();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}