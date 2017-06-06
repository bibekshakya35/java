package tictatoe;

/**
 * @author bibek
 */
public class TicTacToe {

    private final Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};
    private char lastPlayer = '\0';
    public String play(int x, int y) {
        this.checkAxis(x);
        this.checkAxis(y);
        this.setBox(x,y);
        lastPlayer = this.nextPlayer();
        return "No winner";
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("X is outside the box");
        }
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is completed");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

    public char nextPlayer() {
        if (lastPlayer=='X'){
            return 'O';
        }
        return 'X';
    }
}
