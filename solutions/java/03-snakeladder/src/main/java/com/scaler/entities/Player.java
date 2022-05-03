package com.scaler.entities;

public class Player {
    private String name;
    private int position;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static class Builder {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        Player build() {
            return new Player(name, 0);
        }
    }
}
