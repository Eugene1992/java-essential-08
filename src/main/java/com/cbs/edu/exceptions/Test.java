package com.cbs.edu.exceptions;

/**
 * Created by evgeniy on 29/09/16.
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception | Error e) { // multy catch
            e.printStackTrace();
        } /*catch (ArithmeticException e) {

        }*/
    }

}
