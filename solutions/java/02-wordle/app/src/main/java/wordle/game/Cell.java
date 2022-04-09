package wordle.game;

enum CellColor {
    WHITE,
    LIGHT_GREY,
    DARK_GREY,
    GREEN,
    YELLOW
}
class Cell {
    char character;
    CellColor color;

    public Cell(char character, CellColor color) {
        this.character = character;
        this.color = color;
    }
}

