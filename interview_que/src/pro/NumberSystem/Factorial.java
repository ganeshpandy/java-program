package pro.NumberSystem;

public class Factorial {

	public static void main(String[] args) {
		int n=4;
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
System.out.println(fact);
	}

}
