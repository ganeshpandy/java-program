package pro.Array_concept;

public class Changeindex {
public static void main(String[] args) {
	int[]a= {4,5,6,7,8,9};
	int temp;
	System.out.println("Before changing");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i=i+2) {
		temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;		
}
	System.out.println();
	System.out.println("After changing");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
