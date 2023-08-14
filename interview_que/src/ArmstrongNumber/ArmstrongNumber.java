package ArmstrongNumber;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp>0) {
			int num=temp%10;
			rev=rev+num*num*num;
			temp=temp/10;
		}
		if(rev==n) {
			System.out.println(rev+" Number is Armstrong number");
		}
		else {
			System.out.println(rev+" Number is not Armstrong number");
		}
	}

}
