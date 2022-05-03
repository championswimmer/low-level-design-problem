package com.scaler.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTests {
    @Test
    void boardCanBeCreated() {
        Board board = new Board.Builder(10).build();
        assertNotNull(board);
    }

    @Test
    void boardPipesAreWithinBoardBounds() {
        Board board = new Board.Builder(10).build();

        board.getPipes().forEach((start, pipe) -> {
            assertTrue(pipe.getStart() >= 1, "pipe start = " + pipe.getStart());
            assertTrue(pipe.getStart() < 100, "pipe start = " + pipe.getStart());
            assertTrue(pipe.getEnd() >= 1, "pipe end = " + pipe.getEnd());
            assertTrue(pipe.getEnd() < 100, "pipe end = " + pipe.getEnd());
        });
    }

}
