import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("original values are:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false){
			System.out.println("Enter the elements of the array");
		}
	}
}