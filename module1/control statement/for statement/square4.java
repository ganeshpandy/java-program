class square4
{
public static void main(String[]args)
{
int n=5;
int a=5;//5,4,3,2,1
for(int i=0;i<n;i++)//responsible for no of rows
{
for(int j=0;j<n;j++)//responsible for no of column
{
System.out.print(a+" ");
a--;
}
System.out.println();//move the print cursor to next line
a=5;
}
}
}
/*5,4,3,2,1
5,4,3,2,1
5,4,3,2,1
5,4,3,2,1
5,4,3,2,1*/