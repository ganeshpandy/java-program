class Stud{
	final int id;
	final String name;
	final static String district;
	final static String state;
	final static String country;
	
	Stud(int id,String name){
		this.id=id;
		this.name=name;
	}
	static{
		district="chennai";
		state="tamil nadu";
		country="india";
	}
	public static void main(String[]args){
		System.out.println("student details");
		System.out.println("=----------------");
		System.out.println("student id:"+id);
		System.out.println("student name"+name);
		System.out.println("student district"+district);
		System.out.println("student state"+state);
		System.out.println("student country"+country);
	}
}
class MainDriver{
	public static void main(String[]args){
		Stud s1=new Stud(1,"alex");
		s1.displayStudentDetails();
		Stud s2=new Stud(2,"bala");
		s2.displayStudentDetails();
	}
}