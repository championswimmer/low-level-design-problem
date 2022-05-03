package com.scaler.entities;

import java.util.Random;

public class PipeFactory {

    enum PipeType {
        SNAKE,
        LADDER
    }

    private final int boardSize;
    private Random random;

    public PipeFactory(int boardSize) {
        this.boardSize = boardSize;
        this.random = new Random();
    }

    public Pipe createPipe(PipeType pipeType) {
        int start;
        int end;
        if (pipeType == PipeType.SNAKE) {
            int startRow = 1 + random.nextInt(boardSize - 1);
            int endRow = random.nextInt(startRow);

            start = boardSize * startRow + random.nextInt(boardSize - 1) + 1;
            end = boardSize * endRow + random.nextInt(boardSize -1 ) + 1;
            return new Snake(start, end);

        } else { // pipeType == PipeType.LADDER
            int endRow = 1 + random.nextInt(boardSize - 1);
            int startRow = random.nextInt(endRow);

            start = boardSize * startRow + random.nextInt(boardSize - 1) + 1;
            end = boardSize * endRow + random.nextInt(boardSize - 1 );
            return new Ladder(start, end);
        }
    }

}
