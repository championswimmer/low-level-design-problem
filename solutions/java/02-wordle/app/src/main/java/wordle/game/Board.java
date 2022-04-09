package wordle.game;

import java.util.ArrayList;

class Board {
    private int rowSize;

    private ArrayList<Row> rows;

    public Board(int rowNum, int rowSize) {
        this.rowSize = rowSize;

        rows = new ArrayList<Row>();
        for (int i = 0; i < rowNum; i++) {
            rows.add(new Row(rowSize));
        }
    }

    public String getDisplayString () {
        StringBuilder sb = new StringBuilder();
        for (Row row : rows) {
            sb.append(row.getDisplayString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void attempt (int attemptNo, String attempt, String correct) {
        rows.get(attemptNo - 1).attempt(attempt, correct);
    }

    enum RowStatus { EMPTY, ATTEMPTED }

    class Row {
        RowStatus status;
        ArrayList<Cell> cells;

        public Row(int size) {
            this.status = RowStatus.EMPTY;

            cells = new ArrayList<Cell>();
            for (int i = 0; i < size; i++) {
                cells.add(new Cell());
            }
        }

        public String getDisplayString() {
            StringBuilder sb = new StringBuilder();
            for (Cell cell : cells) {
                sb.append(cell.getColoredString());
                sb.append("\t");
            }
            return sb.toString();
        }

        public void attempt(String attempt, String correctWord) {
            assert attempt.length() == correctWord.length();

            for (int i = 0; i < attempt.length(); i++) {
                Character attemptChar = attempt.charAt(i);
                if (attemptChar == correctWord.charAt(i)) {
                    cells.get(i).color = Cell.Color.GREEN;
                } else if (correctWord.indexOf(attemptChar) != -1) {
                    cells.get(i).color = Cell.Color.YELLOW;
                } else {
                    cells.get(i).color = Cell.Color.CYAN;
                }

                cells.get(i).character = attemptChar;
            }

            status = RowStatus.ATTEMPTED;
        }
    }


}
