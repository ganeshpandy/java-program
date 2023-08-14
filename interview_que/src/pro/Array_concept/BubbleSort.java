package pro.Array_concept;

public class BubbleSort {
public static void main(String[] args) {
	int[] a1= {80,70,30,10,90,20};
	int temp=0;
	for(int i=0;i<=a1.length-1;i++)//1
	{
		for(int j=0;j<=a1.length-2;j++)//0,1
		{
			if(a1[j]<a1[j+1]) {
				temp=a1[j];//80,
				a1[j]=a1[j+1];//70,
				a1[j+1]=temp;//80,
			}
		}
	}
	for(int i=0;i<=a1.length-1;i++) {
		System.out.println(a1[i]);
		}
	}
}
