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
        rollMultiple(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    public void rollSpareWith5PinsNexTRoll_scoreReturns20() {
        rollMultiple(5, 3);
        rollMultiple(0, 17);
        assertEquals(20, game.score());
    }

    private void rollMultiple(int pins, int rollCount) {
        int i = 0;
        while (i < rollCount) {
            game.roll(pins);
            i++;
        }
    }
}