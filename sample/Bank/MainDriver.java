import java.util.Scanner;
public class MainDriver{
	public static void main(String[]args){
		static Bank;
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			boolean flag=true;
			do{
				System.out.println("select option");
				System.out.println("press 1.create New customer");
				System.out.println("Press 2.Create New Account Number");
				System.out.println("press 3.Enter the amount");
				System.out.println("press 4.withdrawal");
				System.out.println("press 5.balance");
				System.out.println("press 6.cancel");
				int options=sc.nextInt();
			switch(options){
				case 1:{
					System.out.println("Enter New customer Name");
					String CustomerName=sc.next();
				}break;
				case 2:{
					System.out.println("Enter the New Account Number");
					int accountNo=sc.nextInt();
				}break;
				case 3:{
					System.out.println("Enter the amount");
					int amount=sc.nextInt();
				}break;
				case 4:{
					System.out.println("withdrawal");
					int withDrawal=sc.nextInt();
				}break;
				case 5:{
					System.out.println("Balance");
					int Balance=sc.nextInt();
				}break;
				case 6:{
					flag=false;
					System.out.println("Cancel");
				}break;
				default{
					System.out.println("invalid input");
				}
			}
			}while(flag);
		}
		
	}
}