package com.scaler.entities;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer, Pipe> pipes;

    public Board(int size, Map<Integer, Pipe> pipes) {
        this.size = size;
        this.pipes = pipes;
    }


    public static class Builder {
        private int size;
        /**
         * Map of pipes with their starting point as key
         */
        private Map<Integer, Pipe> pipes;
        private PipeFactory pipeFactory;

        public Builder(int size) {
            this.size = size;
            this.pipeFactory = new PipeFactory(size);
            this.pipes = new HashMap<>();
            while (pipes.size() < size) {
                addPipe(PipeFactory.PipeType.SNAKE);
            }
            while (pipes.size() < size * 2) {
                addPipe(PipeFactory.PipeType.LADDER);
            }
        }


        private void addPipe(PipeFactory.PipeType pipeType) {
            Pipe pipe = pipeFactory.createPipe(pipeType);
            // Either start or end of new pipe should not be where another pipe starts
            if (pipes.get(pipe.getStart()) == null && pipes.get(pipe.getEnd()) == null) {
                pipes.put(pipe.getStart(), pipe);
            }
        }

        public Board build() {
            return new Board(size, pipes);
        }


    }


}
