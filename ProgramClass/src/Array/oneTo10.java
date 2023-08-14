package Array;

public class oneTo10 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int val=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=val;
			val++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
	}
}