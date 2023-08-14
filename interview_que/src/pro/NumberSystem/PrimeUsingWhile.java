package pro.NumberSystem;

public class PrimeUsingWhile {
public static void main(String[] args) {
	int n=13;
	int a=1;
	int count=0;
	while(a<=n/2){
		if(n%a==0){
			count++;
		}
		a++;
	}
	if(count==1){
		System.out.println(n+" :is a prime number");
	}
	else{
		System.out.println(n+": is not a prime number");
		}

}
}
