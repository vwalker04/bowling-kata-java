import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void gameInitializes_scoreReturns0() {
        assertEquals(0, game.score());
    }

    @Test
    public void rollCompleteGameOf1PinRolls_scoreReturns20() {
        int i = 0;
        while (i < 20) {
            game.roll(1);
            i++;
        }
        assertEquals(20, game.score());
    }
}