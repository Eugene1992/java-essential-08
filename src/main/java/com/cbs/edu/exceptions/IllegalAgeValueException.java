package com.cbs.edu.exceptions;

/**
 * Created by evgeniy on 28/09/16.
 */
public class IllegalAgeValueException extends Exception {

    private String message;

    public IllegalAgeValueException(String message) {
        super(message);
    }
}
