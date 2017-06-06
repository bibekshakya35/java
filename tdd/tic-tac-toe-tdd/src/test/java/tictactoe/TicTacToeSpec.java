package tictactoe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

/**
 * Created by bibek on 6/4/17.
 */
public class TicTacToeSpec {

    @Rule
    public ExpectedException expectedException
            = ExpectedException.none();

    private tictatoe.TicTacToe ticTacToe;

    @Before
    public final void before() {
        ticTacToe = new tictatoe.TicTacToe();
    }

    @Test
    public void whenXOutsideBoardThenRuntimeException() {
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(5, 2);
    }

    @Test
    public void whenYOutSideBoardThenRuntimeException() {
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(2, 5);
    }

    @Test
    public void whenOccupiedThenRuntimeException() {
        ticTacToe.play(2, 1);
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(2, 1);
    }

    @Test
    public void givenFirstTurnWhenNextPlayerThenX() {
        assertEquals('X', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasXWhenNextPlayerThenO() {
        ticTacToe.play(1, 3);
        assertEquals('O', ticTacToe.nextPlayer());
    }

    @Test
    public void whenPlayThenNoWinner() {
        String actual = ticTacToe.play(1, 1);
        assertEquals("No winner", actual);
    }

    @Test
    public void whenPlayedAndWholeHorizontalLineThenWinner() {
        ticTacToe.play(1, 1);//X
        ticTacToe.play(1, 2);//O
        ticTacToe.play(2, 1);//X
        ticTacToe.play(2, 2);//0
        String actual = ticTacToe.play(3, 1);
        assertEquals("X is the winner", actual);
    }

    //requirement 3.2
    @Test
    public void whenPlayAndWholeVerticalLineThenWinner() {
        ticTacToe.play(2, 1);//x
        ticTacToe.play(1, 1);//O
        ticTacToe.play(3, 1);//x
        ticTacToe.play(1, 2);//o
        ticTacToe.play(2, 2);//x
        String actual = ticTacToe.play(1, 3);//o
        assertEquals("O is the winner", actual);
    }

    //requirement 3.3
    @Test
    public void whenPlayAndTopBottomDiagonalLineThenWinner() {
        ticTacToe.play(1, 3);
        ticTacToe.play(1, 1);
        ticTacToe.play(2, 2);
        ticTacToe.play(1, 2);
        String actual = ticTacToe.play(3, 1);
        assertEquals("X is the winner", actual);
    }

    //requirement 4
    @Test
    public void whenAllBoxesAreFilledThenDraw() {
        ticTacToe.play(1, 1);
        ticTacToe.play(1, 2);
        ticTacToe.play(1, 3);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 3);
        ticTacToe.play(2, 2);
        ticTacToe.play(3, 1);
        ticTacToe.play(3, 3);
        String actual = ticTacToe.play(3, 2);
        assertEquals("The result is draw", actual);
    }

}
