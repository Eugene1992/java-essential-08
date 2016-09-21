package com.cbs.edu.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(super.name + " said wooff!");
    }
}
