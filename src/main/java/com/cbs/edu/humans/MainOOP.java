package com.cbs.edu.humans;

/**
 * Created by evgeniy on 19/09/16.
 */
public class MainOOP {
    public static void main(String[] args) {
        Human humanOne = new Human("Evgeniy", 23, 1.84);
        System.out.println(humanOne.getWeightIndex());

        Human humanTwo = new Human("Sasha", 25, 1.75);
        System.out.println(humanTwo.getWeightIndex());

        Human humanOThree = new Human("Gleb", 24, 1.87);
        System.out.println(humanOThree.getWeightIndex());

        humanOne.setName("Zhenya");

        Human[] humans = {humanOne, humanTwo, humanOThree};

        Human oldestHuman = new MainOOP().getOldestHuman(humans);
        System.out.println(oldestHuman.getAge());
    }

    /**
     * Get oldest Human instance.
     * @return name of the oldest human
     */
    Human getOldestHuman(Human[] humans) {
        Human result = humans[0];
        for (Human human : humans) {
            if (result.getAge() < human.getAge()) {
                result = human;
            }
        }
        return result;
    }
}
