package com.scaler.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTests {

    @Test
    void canCreateGame() {
        Game game = new Game();
        assertNotNull(game);
    }
}
