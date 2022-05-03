package com.scaler.services;

public class DiceService {

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public int rollDice(int numDice){
        int sum = 0;
        for (int i = 0; i < numDice; i++) {
            sum += rollDice();
        }
        return sum;
    }

}
