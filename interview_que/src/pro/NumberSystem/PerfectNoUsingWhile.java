package pro.NumberSystem;

public class PerfectNoUsingWhile {
public static void main(String[] args) {
	int n=6;
	int a=1;
	int sum=0;
	while(a<=n/2) {
		if(n%a==0) {
			sum=sum+a;
		}
		a++;
	}
	if(sum==n) {
		System.out.println(n+":perfect no");
	}
	else {
		System.out.println(n+":is not perfect no");
	}
}
}
