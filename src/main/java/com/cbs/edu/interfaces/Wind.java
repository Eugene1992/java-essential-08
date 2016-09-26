package com.cbs.edu.interfaces;

/**
 * Created by evgeniy on 23/09/16.
 */
public class Wind implements Moveable {

    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
