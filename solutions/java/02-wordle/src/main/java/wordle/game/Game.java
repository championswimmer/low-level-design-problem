package wordle.game;

import wordle.data.WordFactory;

import java.util.Locale;

public class Game {
    private String correctWord;
    private int maxAttempts;
    private int attempts;
    private int wordSize;
    private Board board;
    private Keyboard keyboard;

    private State state;

    public enum State {
        PLAYING,
        WON,
        LOST
    }

    public State getState() {
        return state;
    }

    private Game(String correctWord, int maxAttempts, int wordSize) {
        this.correctWord = correctWord;
        this.maxAttempts = maxAttempts;
        this.wordSize = wordSize;
        this.attempts = 0;
        this.state = State.PLAYING;

        this.board = new Board(maxAttempts, wordSize);
        keyboard = new Keyboard();
    }

    public void printBoard() {
        // only for debugging
        System.out.println(correctWord);
        System.out.println(board.getDisplayString());
    }

    public void attempt(String attempt) {
        // sanity checks
        if (attempt == null || attempt.length() != wordSize) {
            throw new IllegalArgumentException("Attempt must be a string of length " + wordSize);
        }
        // TODO: check if word is valid dictionary word

        attempts++;

        this.board.attempt(attempts, attempt.toLowerCase(), correctWord);

        /*
         *
         */
    }

    public enum Difficulty {
        HARD,        // 4
        MEDIUM,     // 5
        EASY,       // 6
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
