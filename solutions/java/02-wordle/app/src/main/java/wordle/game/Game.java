package wordle.game;

import wordle.data.WordFactory;

public class Game {
    private String correctWord;
    private int maxAttempts;
    private int wordSize;
    private Board board;
    private Keyboard keyboard;

    private Game(String correctWord, int maxAttempts, int wordSize) {
        this.correctWord = correctWord;
        this.maxAttempts = maxAttempts;
        this.wordSize = wordSize;

        board = new Board(maxAttempts, wordSize);
        keyboard = new Keyboard();
    }

    public enum Difficulty {
        EASY,       // 4
        MEDIUM,     // 5
        HARD        // 6
    }

    public static class Builder {
        private int wordSize;
        private Difficulty difficulty;

        public Builder setWordSize(int wordSize) {
            this.wordSize = wordSize;
            return this;
        }

        public Builder setDifficulty(Difficulty difficulty) {
            this.difficulty = difficulty;
            return this;
        }

        public Game build() {
            if (wordSize == 0) {
                throw new IllegalStateException("Word size must be set");
            }
            if (difficulty == null) {
                throw new IllegalStateException("Difficulty must be set");
            }

            String correctWord = WordFactory.createRandomWord(/* wordSize*/ );
            // using ordinal is not good for larger enums (use switch instead)
            int maxAttempts = difficulty.ordinal() + 4;

            return new Game(correctWord, maxAttempts, wordSize);
        }
    }
}
