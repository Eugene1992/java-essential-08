package com.cbs.edu.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedTest {
    public static void main(String[] args) {
        try {
            checkAge(-12);
        } catch (IllegalAgeValueException e) {
            e.printStackTrace();
        }
    }

    public static void f() throws FileNotFoundException {
        InputStream is = new FileInputStream("C:/temp.txt");
    }

    public static void checkAge(int age) throws IllegalAgeValueException {
        if (age < 0) throw new IllegalAgeValueException("Negative age value");
    }
}
