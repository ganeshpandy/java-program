package pro.Array_concept;

import java.util.Scanner;

public class FindNthMaxNMin {
	public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;     //Declare array size
        System.out.println("Enter the size of the array");
        n=sc.nextInt();   //Initialize array size
        
        int arr[]=new int[n];   //Declare array 
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++)     //Initialize array
       {
           arr[i]=sc.nextInt();
       }
              
       for(int i=0;i<n;i++)     //Use to hold the element
       {
           for(int j=i+1;j<n;j++)    //Use to compare with the rest of the elements 
           {
               if(arr[i]<arr[j])     //Check and swap
               {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       
       System.out.println("Second Largest element is "+arr[1]);   //Display second largest element.
       System.out.println("Second Smallest element is "+arr[n-2]);  //Display second smallest element.
    }
}