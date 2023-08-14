import java.util.Scanner;
class Program1
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numeber");
		int num=scn.nextInt();
		int square=num*num;
		System.out.println(num+"square is"+square);
	}
}