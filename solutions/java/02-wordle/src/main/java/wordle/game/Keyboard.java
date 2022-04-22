package wordle.game;

import java.util.HashMap;

class Keyboard {
    HashMap<Character, Cell> keys;
    
    public Keyboard() {
        keys = new HashMap<Character, Cell>();
        keys.put('q', new Cell('Q', Cell.Color.LIGHT_GREY));
        keys.put('w', new Cell('W', Cell.Color.LIGHT_GREY));
        keys.put('e', new Cell('E', Cell.Color.LIGHT_GREY));
        keys.put('r', new Cell('R', Cell.Color.LIGHT_GREY));
        keys.put('t', new Cell('T', Cell.Color.LIGHT_GREY));
        keys.put('y', new Cell('Y', Cell.Color.LIGHT_GREY));
        keys.put('u', new Cell('U', Cell.Color.LIGHT_GREY));
        keys.put('i', new Cell('I', Cell.Color.LIGHT_GREY));
        keys.put('o', new Cell('O', Cell.Color.LIGHT_GREY));
        keys.put('p', new Cell('P', Cell.Color.LIGHT_GREY));
        keys.put('a', new Cell('A', Cell.Color.LIGHT_GREY));
        keys.put('s', new Cell('S', Cell.Color.LIGHT_GREY));
        keys.put('d', new Cell('D', Cell.Color.LIGHT_GREY));
        keys.put('f', new Cell('F', Cell.Color.LIGHT_GREY));
        keys.put('g', new Cell('G', Cell.Color.LIGHT_GREY));
        keys.put('h', new Cell('H', Cell.Color.LIGHT_GREY));
        keys.put('j', new Cell('J', Cell.Color.LIGHT_GREY));
        keys.put('k', new Cell('K', Cell.Color.LIGHT_GREY));
        keys.put('l', new Cell('L', Cell.Color.LIGHT_GREY));
        keys.put('z', new Cell('Z', Cell.Color.LIGHT_GREY));
        keys.put('x', new Cell('X', Cell.Color.LIGHT_GREY));
        keys.put('c', new Cell('C', Cell.Color.LIGHT_GREY));
        keys.put('v', new Cell('V', Cell.Color.LIGHT_GREY));
        keys.put('b', new Cell('B', Cell.Color.LIGHT_GREY));
        keys.put('n', new Cell('N', Cell.Color.LIGHT_GREY));
        keys.put('m', new Cell('M', Cell.Color.LIGHT_GREY));
    }
    

}
