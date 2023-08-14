package Descending.Multiplication;

public class Mul {
	public static void mul(int a) {
		if(a%2==0 && a>0) {
		for (int i = 10; i >=1; i--) {
			  System.out.println(i+"*"+a+"="+ i*a);	
			}
		}
	}
}
