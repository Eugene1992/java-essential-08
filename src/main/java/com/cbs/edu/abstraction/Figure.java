package com.cbs.edu.abstraction;

/**
 * Created by evgeniy on 22/09/16.
 */
public abstract class Figure {

    protected int side;

    public Figure(int side) {
        this.side = side;
    }

    public abstract int getArea();

    void k() {

    }
}
