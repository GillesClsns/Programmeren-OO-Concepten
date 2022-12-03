package be.gilles.entity.hostile;

import be.gilles.entity.Player;

public class Follower extends SimpleMonster {

    public Follower(int x, int y, Player player) {

        super(x, y, player);

    }

    @Override
    public void move() {

        // X-movement
        if (this.player.getX() > this.x) this.x++;
        else this.x--;

        // Y-movement
        if (this.player.getY() > this.y) this.y++;
        else this.y--;

    }

    @Override
    public String toString() {
        return "F";
    }

}