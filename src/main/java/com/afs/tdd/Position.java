package com.afs.tdd;

public class Position {

    private int x_coordinate;
    private int y_coordinate;
    private int direction_index;

    private static final char DIRECTION_NORTH = 'N';
    private static final char DIRECTION_EAST = 'E';
    private static final char DIRECTION_SOUTH = 'S';
    private static final char DIRECTION_WEST = 'W';

    public static final char[] dirtChars = {DIRECTION_NORTH, DIRECTION_EAST, DIRECTION_SOUTH, DIRECTION_WEST};

    public Position(int x_coordinate, int y_coordinate, int direction_index) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction_index = direction_index;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public int getDirt() {
        return direction_index;
    }

    public void setDirt(int dirt) {
        this.direction_index = dirt;
    }
}
