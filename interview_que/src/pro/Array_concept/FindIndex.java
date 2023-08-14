package pro.Array_concept;

import java.util.Scanner;

public class FindIndex {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5}; 
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an index value to print: ");
    
    
    int i = sc.nextInt();

    if (i >= 0 && i <arr.length) {
        System.out.println("Value at index " + i + " is " + arr[i]);
    } else {
        System.out.println("Invalid index value entered.");
    }
}
}
