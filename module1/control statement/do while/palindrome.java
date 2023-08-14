class palindrome
{
public static void main(String[]args)
{
int num=2874;
int rev=0;
while(num>0)
	
{
int last=num%10;
rev=rev*10+last;
num=num/10;
}
if(num==rev)
System.out.println("palindrome"+num);
else
System.out.println("not palindrome"+num);
}
}