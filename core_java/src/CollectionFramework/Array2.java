package CollectionFramework;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(22);
		a1.add(31);
		a1.add(22);
		a1.add(null);
		System.out.println("a1="+a1);
		System.out.println(a1.get(2));//get value from array list
		for(int i=0;i<a1.size();i++) {//a1.size()is used to find the arraylist
			System.out.println(a1.get(1));//1,2,3,4,5
		}
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		System.out.println(a1.equals(a2));
	}

}
