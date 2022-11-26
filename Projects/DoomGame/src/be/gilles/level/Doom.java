package be.gilles.level;

import be.gilles.entity.Player;

public class Doom {

    protected Room room;

    Player player = new Player(15, 5);

    public Doom() {
        this.room = new Room(player);
    }

    public boolean isFinished() {
        return room.isFinished();
    }

    protected void showInfo() {

        System.out.println("Health: " + room.getPlayer().getHealth());
        player.printPlayerCords();
        player.attack(2);

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