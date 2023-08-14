package SumofArray;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int val=1;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=val;
			val++;
		}
		for(int i=0;i<arr.length;i++) {
			 sum = arr[i]+sum;
		}
		System.out.println(sum);
	}
}
