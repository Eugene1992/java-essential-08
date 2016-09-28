package com.cbs.edu.anon_local_classes;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat anotherCat) {
        if (this.age > anotherCat.age) return 1;
        if (this.age < anotherCat.age) return -1;
        return 0;
    }

    public void move() {
        System.out.println("Move like a Cat");
    }
}
