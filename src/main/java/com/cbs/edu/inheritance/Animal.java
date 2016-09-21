package com.cbs.edu.inheritance;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal say something...");
    }
}
