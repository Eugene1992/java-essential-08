package com.cbs.edu.inheritance;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Murka");
        Animal duck = new Duck("Donald");

        speaks(animal, dog, cat, duck);
    }

    static void speaks(Animal... animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    static void speaksWithout(Animal... animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.speak();
            }
        }
    }
}
