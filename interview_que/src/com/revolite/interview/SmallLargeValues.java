package com.revolite.interview;

public class SmallLargeValues {
    
    public static void main(String[] args) {
        
        int[] array = {23, 6, 42, 17, 54, 9, 32};
        
        int small = array[0];
        int large = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
            if (array[i] > large) {
                large = array[i];
            }
        }
        
        System.out.println("Smallest value: " + small);
        System.out.println("Largest value: " + large);
    }
}
