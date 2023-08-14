package Calc;
import java.util.*;
public class Class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter Second number");
		int n2=sc.nextInt();
		System.out.println("Enter the required operation");
		char operator=sc.next().charAt(0);
		int res=calc(n1,n2,operator);
		System.out.println(n1+" "+operator+" "+n2+"="+res);
		}
	static int calc(int n1,int n2,char operator)
	{
		int res=0;
		switch(operator)
		{
			case'+':
			res=n1+n2;
			break;
			case'-':
			res=n1-n2;
			break;
			case'*':
			res=n1*n2;
			break;
			case'/':
			res=n1/n2;
			break;
			
	}
	return res;
}
}