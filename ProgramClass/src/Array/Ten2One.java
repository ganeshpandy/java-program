package Array;

public class Ten2One {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int val=10;
		for(int i=0;i<arr.length;i++) {
			arr[i]=val;
			val--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	
	}

}
