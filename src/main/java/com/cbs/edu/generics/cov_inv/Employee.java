package com.cbs.edu.generics.cov_inv;

/**
 * Created by evgeniy on 30/09/16.
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
