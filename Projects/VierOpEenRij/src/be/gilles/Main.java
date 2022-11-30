package be.gilles;

import be.gilles.level.Board;

public class Main {

    public static void main(String[] args) {

        //Board board = new Board();

        int HEIGHT = 18;
        int WIDTH = 16;

        char[][] boardTest = new char[HEIGHT][WIDTH];

        for (int i = 0; i < WIDTH; i++) {

            char n = i % 2 == 0 ? ' ' : Integer.toString(i).charAt(0);
            boardTest[0][i] = n;
        }


        // Spacers
        for (int i = 0; i < WIDTH; i++) {

            for (int j = 0; j < HEIGHT; j++) {

                char s = j % 2 == 0 ? ' ' : '-';
                boardTest[j][i] = s;

            }

        }

        // Pillars
        for (int i = 0, j = 2; i < WIDTH && j < HEIGHT; i++, j++) {

            char s = i % 2 == 0 ? '|' : ' ';
            boardTest[j][i] = s;

        }



        for (char[] x : boardTest) {
            System.out.println(x);
        }
    }
}
