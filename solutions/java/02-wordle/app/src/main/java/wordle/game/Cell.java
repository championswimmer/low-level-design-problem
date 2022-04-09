package wordle.game;

import wordle.io.ColoredStrings;


class Cell {
    Character character;
    Color color;

    public Cell(char character, Color color) {
        this.character = character;
        this.color = color;
    }

    enum Color {
        WHITE,
        LIGHT_GREY,
        CYAN,
        GREEN,
        YELLOW
    }

    public Cell() {
        this.color = Color.WHITE;
    }

    public String getColoredString() {
        if (character == null) {
            return "_";
        }
        switch (color) {
            case GREEN:
                return ColoredStrings.getInGreen(character.toString().toUpperCase());
            case YELLOW:
                return ColoredStrings.getInYellow(character.toString().toUpperCase());
            case CYAN:
                return ColoredStrings.getInCyan(character.toString().toUpperCase());
            default:
                return character.toString();
        }
    }
}

