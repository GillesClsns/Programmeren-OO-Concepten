package be.gilles.entity.hostile;

import be.gilles.entity.Player;

import java.util.Random;

public class TimeBomb extends Monster {

    private final int BOMB_STRENTH;
    private int startTime;
    private int timeLeft;

    public TimeBomb(int x, int y, Player player) {

        super(x, y, player);
        BOMB_STRENTH = 2;
        startTime = new Random().nextInt(5, 11);

    }

    @Override
    public void move() {
        startTime--;
        if(startTime == 0) this.attackPlayer();
    }

    @Override
    public String toString() {
        return String.format("%d", startTime);
    }

    @Override
    public void attackPlayer() {
        if(Math.abs(player.getX()) - this.getX() <= 5) player.attack(BOMB_STRENTH);
    }
}
