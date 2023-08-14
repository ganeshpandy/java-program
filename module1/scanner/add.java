import java.util.Scanner;
class add
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number");
		double num1=scn.nextInt();
		System.out.println("Enter 2nd number");
		double num2=scn.nextDouble();
		double sum=num1+num2;
		System.out.println("result:"+sum);
	}
}