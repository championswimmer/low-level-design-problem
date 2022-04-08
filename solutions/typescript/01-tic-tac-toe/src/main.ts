import { Player } from "./entities/Player";
import { Game } from "./entities/Game";


const pb = new Player.Builder()
const p = pb.setName("Arnav").setCharacter("✅").build()

console.log(p.name, p.character)


const gb = new Game.Builder()

gb.createPlayer1("Naman").createPlayer2("Arnav").build()