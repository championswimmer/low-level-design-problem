import { Game } from "./entities/Game";
import * as rl from 'readline-sync'


const gameBuilder = new Game.Builder()

const player1Name = rl.question("Enter Player 1 name: ")
const player1Char = rl.question("Enter Player 1 character (X): ", { defaultInput: "X" })

gameBuilder.addPlayer1(player1Name, player1Char)

const player2Name = rl.question("Enter Player 2 name: ")
const player2Char = rl.question("Enter Player 2 character (O): : ", { defaultInput: "O" })

gameBuilder.addPlayer2(player2Name, player2Char)

const game = gameBuilder.build()

while (game.state == "STARTED") {
    console.log(game.nextTurnPrompt())
    const box = rl.question("Enter Box: ")
    game.play(box)
}
