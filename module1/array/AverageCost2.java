class AverageCost2
{
public static void main(String[]args)
{
double[]height={5.5,6.2,5.7,5.4};
double sum=0;
for(int i=0;i<height.length;i++)
{
	sum=sum+height[i];
}
double average=sum/height.length;
System.out.println("averageofheight:"+average);
}
}