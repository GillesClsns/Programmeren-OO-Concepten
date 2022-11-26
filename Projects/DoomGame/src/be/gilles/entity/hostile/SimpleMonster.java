package be.gilles.entity.hostile;

import be.gilles.entity.Player;

public class SimpleMonster extends Monster {

    public SimpleMonster(int x, int y, Player player) {

        super(x, y, player);

    }

    public void attackPlayer() {

        if (Math.abs(player.getX() - this.getX()) <= 1 && (Math.abs(player.getY() - this.getY()) <= 1)) player.attack(STRENGTH);

    }

    @Override
    public String toString() {
        return "M";
    }

}