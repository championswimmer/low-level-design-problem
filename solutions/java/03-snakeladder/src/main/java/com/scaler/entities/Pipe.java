package com.scaler.entities;

abstract class Pipe {
    protected int start;
    protected int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Pipe(int start, int end) {
        if (start == end) {
            throw new InvalidPipeException();
        }
        this.start = start;
        this.end = end;
    }

    static class InvalidPipeException extends IllegalArgumentException {
        public InvalidPipeException() {
            super("Pipe start and end cannot be same");
        }
    }
}
