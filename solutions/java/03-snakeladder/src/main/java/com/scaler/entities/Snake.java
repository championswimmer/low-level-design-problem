package com.scaler.entities;

public class Snake extends Pipe {
    public Snake(int head, int tail) {
        super(head, tail);
        if (head < tail) {
            throw new IllegalArgumentException("Snake start must be greater than end");
        }
    }
}
