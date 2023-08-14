package ArmstrongNumber;

public class Armstrong {
public static void main(String[] args) {
	for(int n=121;n<=121121099;n++) {
		armcheck(n);
	}
}
public static void armcheck(int n) {
	String s=Integer.toString(n);
	int x=s.length();
	int res=0;
	int temp=n;
	int rem=0;
	while(n>0) {
		rem=n%10;
		int sum=1;
		for(int i=1;i<=x;i++) {
			sum=sum*rem;
		}
		res=res+sum;
		n=n/10;
	}
	if(temp==res) {
		System.out.println(temp);
	}
}
}
