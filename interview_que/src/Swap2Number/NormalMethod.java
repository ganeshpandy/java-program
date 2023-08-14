package Swap2Number;
import java.util.*;
public class NormalMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int n1=sc.nextInt();
		System.out.println("Enter the second Number");		
		int n2=sc.nextInt();
		System.out.println("Before swaping n1="+n1+" , " +"n2="+n2);
		int n3=n1;
		n1=n2;
		n2=n3;
		
		System.out.println("After swaping:"+n1+" "+n2);
		
	}

}
