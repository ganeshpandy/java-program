class forloop11
{
public static void main(String[]args)
{
int n=5;
char ch='a';//a,b,c,b,a
for(int i=0;i<n;i++)
{
	System.out.print(ch+" ");
if(i<n/2)
{
ch++;
}
else
{
ch--;
}
}
}
}
/*	0<5	1<5	2<5	3<5	4<5
ch=0 1	
i=0	 a
i=1  */