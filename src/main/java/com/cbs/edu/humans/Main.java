package com.cbs.edu.humans;

/**
 * Created by evgeniy on 19/09/16.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"Sasha", "Sergey", "Gleb"};
        int[] ages = {27, 26, 29};
        double[] heights = {180.0, 180.0, 180.0};

        System.out.println(HumanService.sort(names, ages, heights));
    }
}
