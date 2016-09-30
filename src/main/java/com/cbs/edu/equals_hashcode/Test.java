package com.cbs.edu.equals_hashcode;

public class Test {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Barsik", 2);
        Pet pet2 = new Pet("Barsik", 2);

        System.out.println(pet1.hashCode());
        System.out.println(pet2.hashCode());
    }
}
