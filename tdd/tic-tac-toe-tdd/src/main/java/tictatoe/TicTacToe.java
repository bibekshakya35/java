package tictatoe;

/**
 *
 * @author bibek
 */
public class TicTacToe {

    private final Character[][] board = {{null, null, null}, {null, null, null}, {null, null, null}};

    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X IS OUTSIDE BOARD");
        } else if (y < 1 || y > 3) {
            throw new RuntimeException("Y IS OUTSIDE BOARD");
        }
        if (board[x - 1][y - 1] != null) {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }

    }
}
