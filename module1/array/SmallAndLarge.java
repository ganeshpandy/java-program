class SmallAndLarge
{
public static void main(String[]args)
{
int[]arr={23,22,26,25,24,27,28};
int small=arr[0];
int large=arr[1];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
large=arr[i];
}
else if(arr[i]<small)
{
small=arr[i];
}
}
System.out.println("smallest value is:"+small+"largest value is:"+large);
}
}