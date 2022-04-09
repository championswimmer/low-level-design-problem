package wordle.game;

class Board {
    private int rows;
    private int rowSize;

    public Board(int rows, int rowSize) {
        this.rows = rows;
        this.rowSize = rowSize;
    }

    enum RowStatus { EMPTY, ATTEMPTED }

    class Row {
        RowStatus status;
        int size;
    }
}
