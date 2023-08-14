import java.util.Scanner;
class Fibo{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("Enter fibnocci number");
	int fib1=sc.nextInt();
	int fib2=sc.nextInt();
	int fib3=fib1+fib2;
	while(n>0)
	{
		System.out.println(fib1);
		fib1=fib2;
		fib2=fib3;
		fib3=fib1+fib2;
		n--;
	}
}
}
	
	