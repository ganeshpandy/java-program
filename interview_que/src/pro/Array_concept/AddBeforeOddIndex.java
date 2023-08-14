package pro.Array_concept;

public class AddBeforeOddIndex {
public static void main(String[] args) {
	int[]a= {1,5,7,8,3,2};    //
	int temp=0; 
    for(int i=0; i<=a.length-1; i++)
    {
    	temp=0;
    	if(i==0)
    	{
    		System.out.print(a[i]+"  ");
    	}
    	else
    	if(i%2==0 && i!=0)
    	{
    		temp=a[i-1]+a[i-2];//6
    		System.out.print(temp+"  ");
    		
    		
    	}
    	else if(i%2!=0)
    	{
    	  System.out.print(a[i]+"  ");	
    	}
    	
//    	System.out.print(a[i]+"  ");
    	
    	
    }
	
	
	
	
	
	
	}
}	
