package com.cbs.edu.humans;

public class Human {

    private String firstname;
    private int age;
    private double height;
    static final String PLANET = "Planet";

    public Human(String name, int age, double height) {
        this.firstname = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getName() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeightIndex() {
        return height / age;
    }
}
