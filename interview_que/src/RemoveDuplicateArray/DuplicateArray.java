package RemoveDuplicateArray;
import java.util.*;
public class DuplicateArray {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size=sc.nextInt();
	//to enter the elements
    int[] array=new int[size];
	System.out.println("Enter the elements of an array:");
	for(int i=0 ; i<size ; i++)
	{
       array[i]=sc.nextInt();
	}
    System.out.println("The entered elements are:");
    for(int i=0 ; i<size ; i++)
    {
    	System.out.print(array[i]+"  ");
    }
    System.out.println();
    System.out.println("After removing duplicate elements are:");
    int temp[]=new int[size];
    int j=0;
    Arrays.sort(array);//1,2,3,1,2,3,4-->01,1,2,2,3,3,4
		for(int i=0; i<size-1; i++)//1,2,1,3,4
		{
			if(array[i]!=array[i+1])
			{
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[size-1];
		for(int k=0; k<j; k++)
		{
				System.out.print(temp[k]+"  ");
		}
	}
}