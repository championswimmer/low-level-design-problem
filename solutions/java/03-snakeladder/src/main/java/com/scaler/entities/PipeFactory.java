package com.scaler.entities;

public class PipeFactory {

    enum PipeType {
        SNAKE,
        LADDER
    }
    private int boardSize;

    public PipeFactory(int boardSize) {
        this.boardSize = boardSize;
    }

    public Pipe createPipe(PipeType pipeType) {

    }

}
