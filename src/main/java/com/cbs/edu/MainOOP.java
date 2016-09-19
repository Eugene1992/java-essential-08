package com.cbs.edu;

/**
 * Created by evgeniy on 19/09/16.
 */
public class MainOOP {
    public static void main(String[] args) {
        Human humanOne = new Human();
        humanOne.name = "Evgeniy";
        humanOne.age = 33;
        humanOne.height = 1.84;

        Human humanTwo = new Human();
        humanTwo.name = "Sasha";
        humanTwo.age = 31;
        humanTwo.height = 1.94;

        Human humanOThree = new Human();
        humanOThree.name = "Serega";
        humanOThree.age = 29;
        humanOThree.height = 1.89;

        Human[] humans = {humanOne, humanTwo, humanOThree};

        Human oldestHuman = getOldestHuman(humans);
        System.out.println(oldestHuman.name);
    }

    /**
     * Get oldest Human instance.
     * @return name of the oldest human
     */
    static Human getOldestHuman(Human[] humans) {
        Human result = humans[0];
        for (Human human : humans) {
            if (result.age < human.age) {
                result = human;
            }
        }
        return result;
    }
}
