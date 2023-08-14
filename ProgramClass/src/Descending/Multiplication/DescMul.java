package Descending.Multiplication;

public class DescMul {
	public static void descMul(int a) {
	if(a%2==0 && a>0) {
		for (int i = 1; i >=10; i--) {
			  System.out.println(i+"*"+a +"=" + i*a);	
			}
		}
	}
}