import java.util.Scanner;
class PrimeNo{
	public static void main(String[]args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("it is prime number:"+n);
		}
		else{
			System.out.println("it is not a prime number:"+n);
		}
	}
}