class ThirdSmallValue
{
public static void main(String[]args)
{
int[]arr={23,22,26,25,24,27,28};
int small=arr[0];
int ssmall=arr[1];
int tsmall=arr[2];
for(int i=1;i<arr.length;i++)
{
if(arr[i]<small)
{
ssmall=small;
small=arr[i];
}
else if(arr[i]<ssmall)
{
ssmall=arr[i];
}
else if(arr[i]<tsmall)
{
	tsmall=arr[i];
}
}
System.out.println("3rd smallest value is:"+tsmall);
}
}