import { Player } from "./Player";
import { Board } from "./Board";

type GameState = "STARTED" | "END_WINNER" | "END_DRAW"

export class Game {
    p1: Player
    p2: Player
    board: Board
    turn = 0
    state: GameState = "STARTED"


    private constructor(p1: Player, p2: Player, board: Board) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = board;
    }

    private checkWinner(player: Player): boolean {
        const c = player.character
        const winningLine = `${c}${c}${c}`
        for (let row of ["A", "B", "C"]) {
            if (this.board.getRowAsString(row) == winningLine)
                return true
        }
        for (let col of [0,1,2]) {
            if (this.board.getColAsString(col) == winningLine)
                return true
        }
        for (let diag of [0,1]) {
            if (this.board.getDiagAsString(diag) == winningLine)
                return true
        }

        return false

    }

    nextTurnPrompt(): string {
        const player = this.turn % 2 == 0 ? this.p1 : this.p2;

        return '\n' + this.board.getBoardForDisplay()
            + '\n'
            + `Turn: ${this.turn + 1}  |  Player : ${player.name} (${player.character})`
    }

    play(box: string) {
        const player = this.turn % 2 == 0 ? this.p1 : this.p2;

        const success = this.board.markBoard(box, player.character)

        if (success) {
            if (this.checkWinner(player)) {
                this.state = "END_WINNER"
                console.log(`Game Over! ${player.name} has won!`)
                return
            }
            this.turn++;
        }

        if (this.turn == 9) {
            this.state = "END_DRAW"
            console.log("Game ended in DRAW")
        }
    }

    static Builder = class GameBuilder {
        p1!: Player
        p2!: Player

        addPlayer1(name: string, character: string = "X"): GameBuilder {
            this.p1 = new Player.Builder()
                .setName(name)
                .setCharacter(character)
                .build()
            return this;
        }

        addPlayer2(name: string, character: string = "X"): GameBuilder {
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