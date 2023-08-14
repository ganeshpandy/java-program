package pro.Print1toN;

import java.util.Scanner;

public class Print1toNoddNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--) {
		if(i%2!=0) {
			System.out.println(i);
			}
	
		}
	}
}
