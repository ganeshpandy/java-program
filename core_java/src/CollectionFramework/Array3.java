package CollectionFramework;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		System.out.println(a1);
		System.out.println(a1.hashCode());//to get the address of the variable
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		System.out.println(a2);
		System.out.println(a2.hashCode());
		System.out.println(a2.equals(a2));
		ArrayList<Integer>a3=(ArrayList<Integer>)a2.clone();
		System.out.println(a3);

	}

}
