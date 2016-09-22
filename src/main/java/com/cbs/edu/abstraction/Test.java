package com.cbs.edu.abstraction;

/**
 * Created by evgeniy on 22/09/16.
 */
public class Test {
    public static void main(String[] args) {
//        Figure figure = new Figure();
        Figure triangle = new Triangle(2);
        Rectangle rectangle = new Rectangle(2);
        f(triangle, rectangle);
    }

    static void f(Figure... figures) {
        for (Figure figure : figures) {
            System.out.println(figure.getArea());
        }
    }
}
