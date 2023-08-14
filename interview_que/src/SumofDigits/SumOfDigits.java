package SumofDigits;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how Numbers You want sum");
		int num=sc.nextInt();
		int sum=0;
	while(num!=0) {
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	System.out.println("sum of digits are:"+sum);
	}

}
