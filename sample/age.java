import java.util.Scanner;
class age{
	public static void main(String[]args){
		int age;
		String state;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		 age=sc.nextInt();
		 System.out.println("enter ur state");
		 state=sc.next();
		if(age>=18 && age<=60){
			switch(state){
				case "tn":
				{
					System.out.println("valid for vote in TN ");
					break;
				}
				case "ka":
				{
					System.out.println("valid for vote in ka ");
					break;
				}
				case "kl":
				{
					System.out.println("valid for vote in ka ");
					break;
				}
				default:{
					System.out.println("invalid");
					break;
				}
			}
	}else if(age>=15)
					System.out.println("eligiable in other states");
				else
					System.out.println("invalid");
	
	}
}
