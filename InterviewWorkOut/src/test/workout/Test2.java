package test.workout;

import java.util.Arrays;

public class Test2 {
public static void main(String[] args) {
	String s1="ababcca";//aaabbcc
	char array[]=s1.toCharArray();
//	Arrays.sort(array);
	for(int i=0; i<array.length; i++)
	{
		for(int j=0; j<array.length-1; j++)
		{
			if(array[j]>array[j+1])
			{
				char temp=array[j];
				array[j]=array[j+1]; 
				array[j+1]=temp;
			}
		}
	}
	for(int i=0; i<array.length; i++)
	{
		System.out.println(array[i]);
	}
    //Occurance
	int count=1; 
	for(int i=0; i<array.length-1; i++)
	{
		if(array[i]==array[i+1])
		{
			count++;
		}
		else
		{
			System.out.println(array[i]+" Occurs "+count+" times");
			count=1; 
		}
	}
	}
}