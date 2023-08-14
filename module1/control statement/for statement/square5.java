class square5
{
public static void main(String[]args)
{
	int n=5;
	char ch='a';
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	System.out.print(ch+" ");
	ch++;
}
System.out.println();
ch='a';
}	
}
}
/*a b c d e
a b c d e
a b c d e
a b c d e
a b c d e*/