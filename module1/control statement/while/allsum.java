class allsum
{
public static void main(String[] args)
{
int a=1;
int b=10;
int allsum=0;
int evensum=0;
int oddsum=0;
while(a<=b)
{
allsum=allsum+a;
if(a%2==0)
evensum=evensum+a;
else
	oddsum=oddsum+a;
}
a++;
	System.out.println(allsum);	
	System.out.println(evensum);
	System.out.println(oddsum);
	}
}


