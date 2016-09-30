package com.cbs.edu.equals_hashcode;

/**
 * Created by Sasha on 19.09.2016.
 */
public class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object anotherPet) {
        if (this == anotherPet) return true;
        if (anotherPet == null || this.getClass() != anotherPet.getClass()) {
            return false;
        }

        Pet pet = (Pet) anotherPet;

        if (this.age != pet.age) return false;

        if (name != null) {
            return name.equals(pet.name);
        } else {
            return pet.name == null;
        }
    }

    @Override
    public int hashCode() {
        return 10;
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
}
