import { Board } from "../src/entities/Board";


test('board is initialised', () => {
    const board = new Board();
    expect(board.getRow(0)).toEqual('___');
    expect(board.getColumn(0)).toEqual('___');
})

test('board 1,1 can be marked', () => {
    const board = new Board();
    board.mark(1, 1, 'X');
    expect(board.getRow(1)).toEqual('_X_');
    expect(board.getColumn(1)).toEqual('_X_');
})

test('board re-marking box throws error', () => {
    const board = new Board();
    board.mark(1, 1, 'X');
    expect(() => {
        board.mark(1, 1, 'X');
    }).toThrow('This box is already marked');

})