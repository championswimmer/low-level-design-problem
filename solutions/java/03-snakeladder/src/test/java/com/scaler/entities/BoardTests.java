package com.scaler.entities;

import org.junit.jupiter.api.RepeatedTest;
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
    @RepeatedTest(30)
    void boardPipesAreWithinBoardBounds() {
        Board board = new Board.Builder(5).build();

        board.getPipes().forEach((start, pipe) -> {
            assertTrue(pipe.getStart() >= 1, "pipe start = " + pipe.getStart());
            assertTrue(pipe.getStart() < 25, "pipe start = " + pipe.getStart());
            assertTrue(pipe.getEnd() >= 1, "pipe end = " + pipe.getEnd());
            assertTrue(pipe.getEnd() < 25, "pipe end = " + pipe.getEnd());
        });
    }

}
