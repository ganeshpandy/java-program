package pro.NumberSystem;

public class RemoveSameEle {
public static void main(String[] args) {
	int[]a= {1,3,5,7,9};
	int[]b= {1,4,2,3,7};
	int[]c=new int[a.length+b.length];
	int k=0;
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<b.length-2;j++) {
			if(a[i]!=b[j]) {
				c[k]=a[i];
				k++;
			}
		}
	}
}
}
