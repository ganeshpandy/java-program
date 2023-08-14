package pro.sumofdigts.largestnumber;

public class Multiply {

	public static void main(String[] args) {
		int n=5;
		int sum=0;
		for(int i=1;i<=n;i++)//
		{
			sum=sum+i;
			if(sum%2!=0) {
				sum=sum*2;
				
			}
			else {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
