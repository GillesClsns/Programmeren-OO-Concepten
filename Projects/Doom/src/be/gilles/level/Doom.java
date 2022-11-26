package be.gilles.level;

import be.gilles.entities.hostile.Monster;
import be.gilles.entities.Player;

import static be.gilles.util.Color.*;

public class Doom {

    private final Room room;
    private final Player player = new Player(10, 40);
    private final Monster monster = new Monster(10,41);

    public Doom() {
        room = new Room(player, monster);

    }

    public void start() {

        while (!room.isFinished()) {

            try {

                Thread.sleep(500);
                room.update();
                room.draw();
                System.out.printf(ANSI_RED +
                        "Health: %.2f"
                        + ANSI_GREEN, player.getHealth());

                // Adding extra whitespace between each frame
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                }

                monster.attack();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}