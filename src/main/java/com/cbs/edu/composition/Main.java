package com.cbs.edu.composition;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Freshener freshener = new Freshener();
        Car car = new Car("Tesla", "Blue", freshener);
        car.run();
        car = null;
        freshener.smell();
    }
}
