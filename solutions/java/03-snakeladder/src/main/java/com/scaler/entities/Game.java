package com.scaler.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Board board;
    private ArrayList<Player> players;

    public Game() {
        int boardSize;
        int players;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the board: ");
        boardSize = scanner.nextInt();
        System.out.println("Enter the number of players: ");
        players = scanner.nextInt();

        board = new Board.Builder(boardSize).build();
        this.players = new ArrayList<>();


        for (int i = 0; i < players; i++) {
            System.out.println("Enter player " + i + " name: ");
            String name = scanner.nextLine();
            this.players.add(
                    new Player.Builder().setName(name).build()
            );
        }
    }
}
