package com.cbs.edu.abstraction;

public class Triangle extends Figure {

    public Triangle(int side) {
        super(side);
    }

    @Override
    public int getArea() {
        return 100;
    }
}
