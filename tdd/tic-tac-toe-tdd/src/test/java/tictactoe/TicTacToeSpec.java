package tictactoe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
}
