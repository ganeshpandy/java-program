import java.util.Scanner;
class age2{
	public static void main(String[]args){
		String state;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the state");
		state=sc.next();
		if(age>=18){
		if(state.equals("tn") || state.equals("kl") || state.equals("ka") )
		{
			System.out.println("VALID");
		}
		else
		{
		System.out.println("INVALID");
		}
		}
		if(age>=15 && age<18)
		{
			System.out.println("Valid for Vote in some States");
		}
	
	}
}