package com.cbs.edu.interfaces;

/**
 * Created by evgeniy on 23/09/16.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(200);
        Moveable human = new Human(20);
        Moveable wind = new Wind(25);
        Cat cat = new Cat(40);

        cat.defaultMethod();
        Moveable.staticMethod();
        System.out.println(Moveable.K);

        getDistances(3, car, human, wind, cat);
    }

    static void getDistances(int hours, Moveable... moveables) {
        for (Moveable moveable : moveables) {
            System.out.println(moveable.getDistance(hours));
        }
    }
}
