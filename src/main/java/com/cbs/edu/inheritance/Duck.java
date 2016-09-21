package com.cbs.edu.inheritance;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(super.name + " said quack!");
    }
}
