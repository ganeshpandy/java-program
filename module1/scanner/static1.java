import java.util.Scanner;
class Demo
{
	String name;
	long contact;
	void test()
	{
		System.out.println("Executing disp()");
	}
	void run()
	{
		System.out.println("Executing run()");
	}
}
	public class static1
	{
		public static void main(String[]args)
		{
		Scanner inpt=new Scanner(System.in);
		Demo s1=new Demo();
		System.out.println("Enter the name");
		s1.name=input.next();
		System.out.println("enter contact no");
		s1.contact=input.nextLong();
		System.out.println(s1.name);
		System.out.println(s1.contact);
		s1.test();
		s1.run();
		}
	}
