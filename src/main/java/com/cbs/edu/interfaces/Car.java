package com.cbs.edu.interfaces;

import java.io.Serializable;

/**
 * Created by evgeniy on 23/09/16.
 */
public class Car implements Moveable, Serializable, Cloneable {

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void carMethod() {

    }

    @Override
    public int getDistance(int hours) {
        return hours * speed;
    }

    @Override
    public void defaultMethod() {

    }
}
