package io.github.bibekshakya35.tictactoe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by bibek on 6/4/17.
 */
public class TicTacToeSpec {
    @Rule
    public ExpectedException expectedException =
            ExpectedException.none();

    private TicTacToe ticTacToe;

    @Before
    public final  void before(){
        ticTacToe = new TicTacToe();
    }
    @Test
    public void whenXOutsideBoardThenRuntimeException(){
        expectedException.expect(RuntimeException.class);
        ticTacToe.pla
    }
}
