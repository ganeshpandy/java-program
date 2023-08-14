package pro.Array_concept;
public class FindMinNMax {
public static void main(String[] args) {
	int[]a= {5,7,9,1,3,2};
	int min=a[0];
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("max value of an array is:"+max);
	System.out.println("min value of an array is:"+min);
}
}
