class LargeOfValue
{
public static void main(String[]args)
{
int[]arr={14,15,12,13,17,16};
int large=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
large=arr[i];
}
}
System.out.println("largest value:"+large);
}
}