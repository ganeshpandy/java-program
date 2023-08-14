class AverageCost
{
public static void main(String[]args)
{
int[]cost={40,60,90,50};
int sum=0;
for(int i=0;i<cost.length;i++)
{
sum=sum+cost[i];
}
int average=sum/cost.length;
System.out.println("average cost of apple:"+average);
}
}