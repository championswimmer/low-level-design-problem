import { Player } from "./Player";
import { Board } from "./Board";

export class Game {
    p1: Player
    p2: Player
    board: Board


    private constructor(p1: Player, p2: Player, board: Board) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = board;
    }

    static Builder = class GameBuilder {
        p1!: Player
        p2!: Player

        createPlayer1(name: string, character: string = "X"): GameBuilder {
            this.p1 = new Player.Builder()
                .setName(name)
                .setCharacter(character)
                .build()
            return this;
        }

        createPlayer2(name: string, character: string = "X"): GameBuilder {
            this.p2 = new Player.Builder()
                .setName(name)
                .setCharacter(character)
                .build()
            return this;
        }


        build(): Game {
            if (!this.p1) {
                throw new Error("You need to create player 1 before building game")
            }

            if (!this.p2) {
                throw new Error("You need to create player 2 before building game")
            }

            return new Game(this.p1, this.p2, new Board())
        }
    }

}