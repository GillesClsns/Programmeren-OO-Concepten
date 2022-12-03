package be.gilles.level;

public class Piece extends Board {

    private final Color color;

    public enum Color {
        RED, GREEN
    }

    public Piece(Color color) {

        this.color = color;

    }

    public Color getColor() {
        return color;
    }

}
