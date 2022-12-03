package be.gilles.entity.hostile;

import be.gilles.entity.Monster;
import be.gilles.entity.Player;

import java.util.Random;

public class Zombie extends Monster {

    enum ZombieStatus {
        DEATH, ALIVE
    }

    protected ZombieStatus status;

    public Zombie(int x, int y, Player player) {
        super(x, y, player);
    }

    @Override
    public void move() {

        if (new Random().nextInt(10) == 0) {

            this.status = ZombieStatus.ALIVE;
            super.move();
            attackPlayer();

        }




    }

    @Override
    public void attackPlayer() {

        if (Math.abs(player.getX() - this.getX()) <= 1 && (Math.abs(player.getY() - this.getY()) <= 1) && this.status == ZombieStatus.ALIVE) player.attack(STRENGTH);
        else System.out.println("no");

    }

    @Override
    public String toString() {
        return status == ZombieStatus.ALIVE ? "Z" : "+";
    }

}