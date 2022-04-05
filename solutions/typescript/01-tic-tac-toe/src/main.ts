import { Board } from "./entities/Board";


const b = new Board();

b.printBoard();
b.mark(0, 1, 'X');
b.printBoard();
console.log(b.getRow(0));
console.log(b.getColumn(1));