package wordle;

public class Game {
    private String correctWord;
    private Board board;
    private Keyboard keyboard;

    public Game() {
        correctWord = WordFactory.createRandomWord();
    }
}
