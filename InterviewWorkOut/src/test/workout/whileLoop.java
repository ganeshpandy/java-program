package test.workout;

public class whileLoop {
public static void main(String[] args) {
	int n=15;
	int a=1;
	int sum=0;
	while(a<=n/2) {
		if(n%a==0) {
			sum=sum+a;
		}
		a++;
	}
	System.out.println(sum);
}
}
