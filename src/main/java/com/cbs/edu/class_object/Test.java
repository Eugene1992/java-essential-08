package com.cbs.edu.class_object;

import java.lang.reflect.Field;

/**
 * Created by evgeniy on 29/09/16.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Employee employee = new Employee("Ivan", 25, new Cat("Barsik"));

        try {
            Employee clone = (Employee) employee.clone();

            clone.cat.name = "Murka";

            System.out.println(employee.cat.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    static class Employee implements Cloneable {
        private String name;
        private int age;
        private Cat cat;

        public Employee(String name, int age, Cat cat) {
            this.name = name;
            this.age = age;
            this.cat = cat;
        }

        @Override
        public String toString() {
            return "Employee{" + name + " " + age + '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }
    }
}
