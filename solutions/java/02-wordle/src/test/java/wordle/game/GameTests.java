package wordle.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTests {
    @Test
    void gameBuilderPreventsEmptyWordSize() {

        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Game.Builder().setDifficulty(Game.Difficulty.EASY).build();
        });
    }

    @Test
    void gameBuilderPreventsNullDifficulty() {

        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Game.Builder().setWordSize(5).build();
        });
    }

    @Test
    void gameBuilderCanBuildGame() {
        Game game = new Game.Builder().setWordSize(5).setDifficulty(Game.Difficulty.EASY).build();
        Assertions.assertNotNull(game);
    }
}
