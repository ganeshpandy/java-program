import java.util.Scanner;
class Factorial1
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter factorial number");
		int fact=sc.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
	
System.out.println(fact);
}
}
