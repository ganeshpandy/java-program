//to display the element of the one dimensional primitive array in java(take the input from the user with respective to the size of the array and element of the array)
import java.util.Scanner;
class  Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the elements of the arrays at the " + i + "index");
			a[i]=sc.nextInt();
		}
		System.out.println("Elements of the arrays");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
