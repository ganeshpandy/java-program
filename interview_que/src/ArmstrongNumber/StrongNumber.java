package ArmstrongNumber;

public class StrongNumber {

public static void main(String[] args) {

	int n = 145;
	int temp = n;
	int sum = 0;
	while(n>0) {
		int rem=n%10;
		int fact=1; 
		while(rem>0) {
			fact=fact*rem;
			rem=rem-1;
		}
		sum=sum+fact; 
		n=n/10;
}
if(temp==sum) {
System.out.println("Is a Strong Number");
}

else {

System.out.println("Is Not a Strong Number");

}

}

}
