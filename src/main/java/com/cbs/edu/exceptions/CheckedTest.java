package com.cbs.edu.exceptions;

import java.io.*;

public class CheckedTest {
    public static void main(String[] args) throws IllegalAgeValueException {

            checkAge(-12);

    }

    public static void f() {
        OutputStream is = null;
        try {
            is = new FileOutputStream("C:/temp.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkAge(int age) throws IllegalAgeValueException {
        if (age < 0) throw new IllegalAgeValueException("Negative age value");
    }
}
