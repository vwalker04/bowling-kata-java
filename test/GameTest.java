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
    public void initializeGameWithScoreOfZero() {
        assertEquals(0, game.score());
    }

    @Test
    public void rollZeroGame() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void rollAllOnes_scoreReturns20() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    public void rollSpareFollowedByFive_scoreReturns20() {
        game.roll(1);
        game.roll(9);
        game.roll(5);

        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(20, game.score());
    }

    @Test
    public void rollStrikeFollowedByOneAndOne_scoreReturns14() {
        game.roll(10);
        game.roll(1);
        game.roll(1);

        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(14, game.score());
    }
}