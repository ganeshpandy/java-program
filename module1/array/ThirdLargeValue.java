class ThirdLargeValue
{
public static void main(String[]args)
{
int[]arr={290,22,260,25,24,270,28};
int large=arr[0];
int slarge=arr[1];
int tlarge=arr[2];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
slarge=large;
large=arr[i];
}
else if(arr[i]>slarge)
{
slarge=arr[i];
}
else if(arr[i]>tlarge)
{
	tlarge=arr[i];
}
}
System.out.println("3rd largest value is:"+tlarge);
}
}