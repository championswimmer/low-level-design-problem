package com.scaler.entities;

public class Ladder extends Pipe {
    public Ladder(int bottom, int top) {
        super(bottom, top);
        if (bottom > top) {
            throw new IllegalArgumentException("Ladder start must be less than end");
        }
    }
}
