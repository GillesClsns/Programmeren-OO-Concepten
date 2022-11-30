package be.gilles.level;

public class Board {

    public final int WIDTH = 8;
    public final int HEIGHT = 17;
    private Piece[][] pieces;
    private char[][] board;


    public Board() {

        for (int i = 0; i < WIDTH; i++) {

            board[0][i] = 'i';

        }

        for (char[] x : board) {
            System.out.print(board);
        }

    }


}
