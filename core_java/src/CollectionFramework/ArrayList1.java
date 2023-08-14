package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("a1="+a1);
		for(Integer integer: a1) {
			System.out.println(integer);
		}
		System.out.println();
		a1.set(1,6);
		a1.set(3, 7);
		for(Integer integer:a1) {
			System.out.println(integer);
		}
		System.out.println();
		a1.remove(4);
		for(Integer integer:a1) {
			System.out.println(integer);
		}
	
	}

}
