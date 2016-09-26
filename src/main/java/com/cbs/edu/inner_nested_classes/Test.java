package com.cbs.edu.inner_nested_classes;

/**
 * Created by evgeniy on 26/09/16.
 */
public class Test /*extends Ship.Engine.InnerEngine*/ {
    public static void main(String[] args) {
        Ship.Engine engine = new Ship().new Engine();
        Ship.StaticNested nested = new Ship.StaticNested();

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1 == i2);
    }
}
