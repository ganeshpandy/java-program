package pro.Array_concept;

	public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int[]a1= {10,20,30,10,20,10,30,40};
		System.out.println("before Sorting");
		for(int i=0;i<=a1.length-1;i++) {
			System.out.println(a1[i]);
		}
		//logic for sorting array
		System.out.println("after sorting array");
		int temp=0;
		for(int i=0;i<=a1.length-1;i++) {
			for(int j=0;j<=a1.length-2;j++) {
				if(a1[j]>a1[j+1]) {
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;		
				}
			}
		System.out.println(a1[i]);
		}
		System.out.println();
		
	//logic for sorting array 10,10,10,20,20,30,30,40
		int[]a2=new int[a1.length];
		int j=0;
		for(int i=0;i<=a1.length-2;i++) {
			if(a1[i]!=a1[i+1]) {
				a2[j]=a1[i];
				j++;
			}
		}
		a2[j]=a1[a1.length-1];
		//print the result
		System.out.println("After Removing Duplicate Array");
		for(int i=0;i<=j;i++) {
			System.out.println(a2[i]);
			}
		}
	}
