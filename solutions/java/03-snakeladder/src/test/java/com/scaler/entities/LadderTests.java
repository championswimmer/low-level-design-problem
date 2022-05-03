package com.scaler.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTests {

    @Test
    void ladderCanBeCreated_WithTopBiggerThanBottom() {
        var ladder = new Ladder(5, 10);
        assertNotNull(ladder);
    }

    @Test
    void ladderCannotBeCreated_WithTopSmallerThanBottom() {
        assertThrows(IllegalArgumentException.class, () -> new Ladder(10, 5));
    }
}
