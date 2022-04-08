import { Board } from "../src/entities/Board";
import exp from "constants";


test('board initialisation works', function (assert) {

    const b = new Board()

    expect(b.getColAsString(0)).toEqual("___")
    expect(b.getColAsString(1)).toEqual("___")
    expect(b.getColAsString(2)).toEqual("___")

    expect(b.getRowAsString("A")).toEqual("___")
    expect(b.getRowAsString("B")).toEqual("___")
    expect(b.getRowAsString("C")).toEqual("___")

    expect(b.getDiagAsString(0)).toEqual("___")
    expect(b.getDiagAsString(1)).toEqual("___")

    assert()

});

test('board marking works', function (assert) {
    const b = new Board()
    b.markBoard("A1", "K")

    expect(b.getRowAsString("A")).toEqual("K__")
    expect(b.getRowAsString("B")).toEqual("___")

    expect(b.getColAsString(0)).toEqual("K__")

    assert()

});

test('board repeat marking returns false', function (assert) {
    const b = new Board()
    const attempt1 = b.markBoard("A1", "K")
    const attempt2 = b.markBoard("A1", "0")

    expect(attempt1).toEqual(true)
    expect(attempt2).toEqual(false)

    assert()

});

test('board wrong box name throws error', function (assert) {

    const b = new Board();

    expect(() => {
        b.markBoard("A4", "1")
    }).toThrow("Invalid box identifier")

    expect(() => {
        b.markBoard("A0", "1")
    }).toThrow("Invalid box identifier")

    expect(() => {
        b.markBoard("D1", "1")
    }).toThrow("Invalid box identifier")

    expect(() => {
        b.markBoard("A", "1")
    }).toThrow("Invalid box identifier")

    expect(() => {
        b.markBoard("A01", "1")
    }).toThrow("Invalid box identifier")

    assert()
});


test('board getter for col/row/diag throws error properly', function (assert) {
    const b = new Board()
    expect(() => {
        b.getRowAsString('D')
    }).toThrow('row number is invalid')

    expect(() => {
        b.getColAsString(5)
    }).toThrow('col has to be between 0 and 2')

    expect(() => {
        b.getDiagAsString(4)
    }).toThrow('Invalid diagonal')

    assert()
});