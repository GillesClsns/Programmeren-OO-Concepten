package be.gilles.level;

import static be.gilles.level.Piece.*;
import static be.gilles.level.Piece.Color.GREEN;

public class Board {

    // Room dimensions declaration
    public final int WIDTH = 17;
    public final int HEIGHT = 18;

    // Game panel
    private Piece[][] pieces = new Piece[1][1];
    private final int pieceCounter;

    public Board() {

        this.pieces = new Piece[HEIGHT][WIDTH];
        this.pieceCounter = 0;

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            stringBuilder.append(" ").append(i);
        }

        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("-".repeat(WIDTH));

        for (int i = 0; i < HEIGHT; i++) {
            stringBuilder.append("|");

            for (int j = 0; j < WIDTH; j++) {

                if (pieces[i][j] == null) {

                    stringBuilder.append(" ").append("|");

                } else {

                    if (pieces[i][j].getColor() == GREEN)

                        stringBuilder.append("O").append("|");

                    else stringBuilder.append("X").append("|");
                }
            }

            stringBuilder.append("\n----------------\n");
        }
        return stringBuilder.toString();
    }
}