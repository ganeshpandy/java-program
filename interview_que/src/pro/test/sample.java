package pro.test;

public class sample   
{  
public static void main(String[] args)   
{  
int a = 19;  
int b = 5;  
//method calling  
int c = add(a, b);   //a and b are actual parameters  
System.out.println("The sum of a and b is= " + c);  
}  
//user defined method  
public static int add(int a, int b)   //n1 and n2 are formal parameters  
{  
int s;  
s=a+b;  
return s; //returning the sum  
}  
}  