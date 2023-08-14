package pro.Array_concept;

public class SearchAnElement {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_ele=5;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found at index:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
		System.out.println("Element not found");
		}
	}

}
