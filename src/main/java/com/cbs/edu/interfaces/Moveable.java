package com.cbs.edu.interfaces;

import java.io.Serializable;

/**
 * Created by evgeniy on 23/09/16.
 */
public interface Moveable extends Serializable, Cloneable {

    public final static int K = 10;

    public abstract int getDistance(int hours);

//    void f();

//  since java 1.8
    default void defaultMethod() {

    }

    static void staticMethod() {

    }
}
