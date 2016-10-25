package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void greetResultsInHello() {
        World world = new World();
        assertEquals("Hello world!", world.greet()); }

}
