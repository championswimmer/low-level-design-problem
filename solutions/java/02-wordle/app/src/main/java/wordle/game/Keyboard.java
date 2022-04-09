package wordle.game;

import java.util.HashMap;

class Keyboard {
    HashMap<Character, Cell> keys;
    
    public Keyboard() {
        keys = new HashMap<Character, Cell>();
        keys.put('q', new Cell('Q', CellColor.LIGHT_GREY));
        keys.put('w', new Cell('W', CellColor.LIGHT_GREY));
        keys.put('e', new Cell('E', CellColor.LIGHT_GREY));
        keys.put('r', new Cell('R', CellColor.LIGHT_GREY));
        keys.put('t', new Cell('T', CellColor.LIGHT_GREY));
        keys.put('y', new Cell('Y', CellColor.LIGHT_GREY));
        keys.put('u', new Cell('U', CellColor.LIGHT_GREY));
        keys.put('i', new Cell('I', CellColor.LIGHT_GREY));
        keys.put('o', new Cell('O', CellColor.LIGHT_GREY));
        keys.put('p', new Cell('P', CellColor.LIGHT_GREY));
        keys.put('a', new Cell('A', CellColor.LIGHT_GREY));
        keys.put('s', new Cell('S', CellColor.LIGHT_GREY));
        keys.put('d', new Cell('D', CellColor.LIGHT_GREY));
        keys.put('f', new Cell('F', CellColor.LIGHT_GREY));
        keys.put('g', new Cell('G', CellColor.LIGHT_GREY));
        keys.put('h', new Cell('H', CellColor.LIGHT_GREY));
        keys.put('j', new Cell('J', CellColor.LIGHT_GREY));
        keys.put('k', new Cell('K', CellColor.LIGHT_GREY));
        keys.put('l', new Cell('L', CellColor.LIGHT_GREY));
        keys.put('z', new Cell('Z', CellColor.LIGHT_GREY));
        keys.put('x', new Cell('X', CellColor.LIGHT_GREY));
        keys.put('c', new Cell('C', CellColor.LIGHT_GREY));
        keys.put('v', new Cell('V', CellColor.LIGHT_GREY));
        keys.put('b', new Cell('B', CellColor.LIGHT_GREY));
        keys.put('n', new Cell('N', CellColor.LIGHT_GREY));
        keys.put('m', new Cell('M', CellColor.LIGHT_GREY));
    }
    

}
