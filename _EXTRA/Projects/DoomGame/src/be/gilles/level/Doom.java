package be.gilles.level;

import be.gilles.entity.hostile.Follower;
import be.gilles.entity.Monster;
import be.gilles.entity.Player;
import be.gilles.entity.hostile.SimpleMonster;
import be.gilles.entity.hostile.TimeBomb;
import be.gilles.entity.hostile.Zombie;
import be.gilles.menu.Menu;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import static be.gilles.util.Color.*;

public class Doom {

    protected Room room;

    Player player = new Player(10, 45);
    ArrayList<Monster> monsters = new ArrayList<>();

    public Doom() {

        final int AMOUNT_OF_MONSTERS = 1;

        // TODO: 28/11/2022 Generate a random amount of entities per type
        // Generating entities at random coordinates
        for (int i = 0; i < AMOUNT_OF_MONSTERS; i++) {

            int rndX = new Random().nextInt(1, 20 - 1);
            int rndY = new Random().nextInt(1, 90 - 1);

            monsters.add(new SimpleMonster(rndX, rndY, player));
            monsters.add(new Follower(rndX, rndY, player));
            monsters.add(new TimeBomb(rndX, rndY, player));
            //monsters.add(new Zombie(rndX, rndY, player));

        }

        // Assigning players and monsters to their room
        this.room = new Room(player, monsters);
        player.setRoom(room);

        for (Monster x : monsters) {
            x.setRoom(room);

        }

    }

    public boolean isFinished() {
        return room.isFinished();
    }

    protected void showInfo() {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.printf("""
                        %-45s %-37s %sHealth: %s
                        """,
                ANSI_BLUE + LocalDate.now(),  // Current date
                LocalTime.now().format(df), // Current time
                ANSI_GREEN, room.getPlayer().getHealth() + ANSI_RESET); // Player health
                // TODO: 28/11/2022 Add a timer

        // Adding whitespace between each frame
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

    }

    public void start() {

        System.out.println("START");

        while (!isFinished()) {

            try {

                Thread.sleep(500);
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