package com.CodeBoard;

import java.util.Arrays;

public class OddEvenPositionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 2, 4, 15, 12, 10, 5 };
        sortOddEven(arr);
        printArray(arr);
    }

    public static void sortOddEven(int[] arr) {
        int n = arr.length;
        // Separate odd and even elements into separate arrays
        int[] oddArr = new int[n];
        int[] evenArr = new int[n];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        // Sort the odd array in descending order
        sortDescending(oddArr, oddIndex);

        // Sort the even array in ascending order
        sortAscending(evenArr, evenIndex);

        // Merge the sorted arrays back into the original array
        int i = 0;
        for (int j = 0; j < oddIndex; j++) {
            arr[i++] = oddArr[j];
        }
        for (int j = 0; j < evenIndex; j++) {
            arr[i++] = evenArr[j];
        }
    }

    public static void sortDescending(int[] arr, int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n  - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sortAscending(int[] arr, int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n  - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
