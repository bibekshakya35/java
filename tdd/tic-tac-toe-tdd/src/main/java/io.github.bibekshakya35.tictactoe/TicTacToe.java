package io.github.bibekshakya35.tictactoe;

/**
 * Created by bibek on 6/4/17.
 */
public class TicTacToe {
    private Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};
    private char lastPlayer ='\0';
    private static final int SIZE = 3;

    public String play(int x,int y){
        this.checkAxis(x);
        this.checkAxis(y);
        lastPlayer = nextPlayer();
    }
    private void checkAxis(int axis){
        if (axis <1 || axis>SIZE){
            throw new RuntimeException("outside the box");
        }
    }
    public char nextPlayer(){
        
    }
}
