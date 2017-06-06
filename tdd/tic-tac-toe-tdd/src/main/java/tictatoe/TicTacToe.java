package tictatoe;

/**
 * @author bibek
 */
public class TicTacToe {

    private static final int SIZE = 3;
    private final Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};
    private char lastPlayer = '\0';

    public String play(int x, int y) {
        this.checkAxis(x);
        this.checkAxis(y);
        lastPlayer = this.nextPlayer();
        this.setBox(x, y, lastPlayer);
        if (this.isWin(x, y)) {
            return lastPlayer + " is the winner";
        } else if (this.isDraw()) {
            return "The result is draw";
        } else {
            return "No winner";
        }
    }

    private boolean isDraw() {
        for (int index = 0; index < SIZE; index++) {
            for (int subIndex = 0; subIndex < SIZE; subIndex++) {
                if (board[index][subIndex] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWin(int x, int y) {
        int playerTotal = lastPlayer * 3;
        char horizontal, vertical, diagonal1, diagonal2;
        horizontal = vertical = diagonal1 = diagonal2 = '\0';
        for (int index = 0; index < 3; index++) {
            horizontal += board[index][y - 1];
            vertical += board[x - 1][index];
            diagonal1 += board[index][index];
            diagonal2 += board[index][SIZE - index - 1];
        }
        return diagonal1 == playerTotal
                || diagonal2 == playerTotal
                || horizontal == playerTotal
                || vertical == playerTotal;
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("X is outside the box");
        }
    }

    private void setBox(int x, int y, char lastPlayer) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is completed");
        } else {
            board[x - 1][y - 1] = lastPlayer;
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X') {
            return 'O';
        }
        return 'X';
    }
}
