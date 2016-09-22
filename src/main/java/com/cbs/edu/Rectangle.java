package com.cbs.edu;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Rectangle {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getArea() {
        return sideOne * sideTwo;
    }
}
