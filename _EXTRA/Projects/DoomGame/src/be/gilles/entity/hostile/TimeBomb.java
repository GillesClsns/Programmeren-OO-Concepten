package be.gilles.entity.hostile;

import be.gilles.entity.Monster;
import be.gilles.entity.Player;

import java.util.Random;

public class TimeBomb extends Monster {

    private final int BOMB_STRENGTH;
    private int startTime;

    public TimeBomb(int x, int y, Player player) {

        super(x, y, player);
        BOMB_STRENGTH = 2;
        startTime = 0;

    }

    @Override
    public void move() {

        if (startTime != 0) {

            startTime--;

        } else {

            this.attackPlayer();
            startTime = new Random().nextInt(5, 11);

        }


    }

    @Override
    public String toString() {
        return String.format("%d", startTime);
    }

    @Override
    public void attackPlayer() {
        if ((Math.abs(player.getX()) - this.getX() <= 5) && (Math.abs(player.getY()) - this.getY() <= 5)) player.attack(BOMB_STRENGTH);
    }

}