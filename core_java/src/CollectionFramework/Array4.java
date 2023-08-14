package CollectionFramework;

import java.util.ArrayList;

public class Array4 {

	public static void main(String[] args) {
		ArrayList<Object>a1=new ArrayList<Object>();
		Project project=new Project();
		a1.add(project);
		Student student=new Student();
		a1.add(student);
		String s1=new String("hello");
		a1.add(s1);
		String s2="javasarvesh";
		a1.add(s2);
		for(Object object:a1) {
			System.out.println(object);
		}

	}

}
