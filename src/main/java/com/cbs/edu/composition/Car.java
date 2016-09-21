package com.cbs.edu.composition;

/**
 * Created by evgeniy on 21/09/16.
 */

public class Car {

    private String model;
    private String color;
    private Engine engine = new Engine(); // composition
    private Freshener freshener;          // aggregation

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public void run() {
        freshener.smell();
        engine.on();
    }
}
