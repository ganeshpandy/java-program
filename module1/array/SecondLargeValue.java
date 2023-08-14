class SecondLargeValue
{
public static void main(String[]args)
{
int[]arr={23,20,27,24,25,22};
int large=arr[0];
int slarge=arr[1];
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
}
System.out.println("largest value:"+large+ "2nd largest value is:"+slarge);
}
}