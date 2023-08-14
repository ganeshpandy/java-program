package pro.NumberSystem;

public class FibnocciSeries {
public static void main(String[] args) {
	int n=10;//capacity
	int fib1=0;
	int fib2=1;
	int fib3=fib1+fib2;
	while(n>0) {
		System.out.print(fib1+" ");//0 1
		fib1=fib2;//1
		fib2=fib3;//1
		fib3=fib1+fib2;//1
		n--;
	}
	
}
}
