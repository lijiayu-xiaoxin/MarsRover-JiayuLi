package com.afs.tdd;

public class Position {
    private int x;
    private int y;
    private int dirtIndex;

    public static final char[] dirtChars = {'N', 'E', 'S', 'W'};

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirt() {
        return dirtIndex;
    }

    public void setDirt(int dirt) {
        this.dirtIndex = dirt;
    }

    public Position(int x, int y, int dirtIndex) {
        this.x = x;
        this.y = y;
        this.dirtIndex = dirtIndex;
    }
}
