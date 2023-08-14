package pro.Array_concept;
public class MergeArray {
public static void main(String[] args) {
	int[]a1= {1,2,3};
	int[]a2= {3,4,5};
	int[]a3=new int[a1.length+a2.length];
	int count=0;
	for(int i=0;i<=a1.length-1;i++) {
		a3[count]=a1[i];
		count++;
	}
	for(int i=0;i<=a2.length-1;i++) {
		a3[count]=a2[i];
		count++;
	}
	for(int i=0;i<=a3.length-1;i++) {
		System.out.println(a3[i]);
		}

}
}
