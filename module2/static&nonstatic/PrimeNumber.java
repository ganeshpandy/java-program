import java.util.Scanner;
class PrimeNumber{
	public static void main(String[]args){
		int count,i;
		System.out.println("enter n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("prime number between 1 to "+n+"are");
		LogicPrime refPrime=new LogicPrime();
		refPrime.call(n,count);
	}
}
class LogicPrime{
	public void call(int n,int count){
		for(int j=2;j<=n;j++){
			count=0;
		for(int i=1;i<=j;i++){
			if(j%i==0){
				count++;
			}
		}
		if(count==2)
		System.out.print(j+" ");
		}
	}
}


