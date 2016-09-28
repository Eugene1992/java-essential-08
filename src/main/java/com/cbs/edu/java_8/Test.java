package com.cbs.edu.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by evgeniy on 27/09/16.
 */
public class Test {

    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Gleb", 26, "Male"),
                new People("Zhenya", 23, "Male"),
                new People("Oksana", 21, "Female")
        );

        List<People> filteredPeoples =
                peoples.stream()
                        .filter((p)-> p.getAge() >= 18 && p.getAge() < 27 && p.getSex().equals("Male"))
                        .collect(Collectors.toList());

        System.out.println(filteredPeoples);
    }

    private static class People {
        private final String name;
        private final Integer age;
        private final String sex;

        public People(String name, Integer age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }
}
