import java.util.Scanner;
class Operation
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		boolean data=true;
		do
		{
			System.out.println("select ur choice");
			System.out.println("1.To perform Addtional");
			System.out.println("2.To exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the first number");
					double f1=sc.nextDouble();
					System.out.println("Enter the Second number");
					double f2=sc.nextDouble();
					System.out.println("Enter the Arithmetic opeartion Name");
					String arithmeticoperation=sc.next();
					ArithmeticOperation arithmeticoperationname=new ArithmeticOperation(f1,f2,arithmeticoperation);
					arithmeticoperationname.addition();
				}
				break;
				case 2:
				{
				data=false;
				System.out.println("thanku");
				}
				break;
				default:
				{
					System.out.println("Invalid chioce");
				}
			}	
		}while(data);
	}
}
