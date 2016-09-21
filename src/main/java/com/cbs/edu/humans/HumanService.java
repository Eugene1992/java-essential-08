package com.cbs.edu.humans;

/**
 * Created by evgeniy on 21/09/16.
 */
public class HumanService {

    /**
     * Get oldest Human instance.
     * @param names array of human names
     * @param ages array of human ages
     * @param heights array of human heights
     * @return name of the oldest human
     */
    static String sort(String[] names, int[] ages, double[] heights) {
        int maxAgeIndex = 0;
        int maxAge = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAgeIndex = i;
                maxAge = ages[i];
            }
        }
        return names[maxAgeIndex];
    }
}
