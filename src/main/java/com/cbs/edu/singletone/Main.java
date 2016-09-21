package com.cbs.edu.singletone;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
    }
}
