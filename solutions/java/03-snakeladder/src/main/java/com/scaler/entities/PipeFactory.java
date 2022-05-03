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
            start  = random.nextInt(boardSize + 1, boardSize * boardSize);
            end = random.nextInt(1, start - (start % boardSize));
            return new Snake(start, end);

        } else { // pipeType == PipeType.LADDER
            start  = random.nextInt(1, boardSize * (boardSize - 1));
            end = random.nextInt(start + (-start % boardSize) + 1, boardSize * boardSize);
            return new Ladder(start, end);
        }
    }

}
