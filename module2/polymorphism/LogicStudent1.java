class LogicStudent1{
	static int id;
	static String name;
	
	static{
		id=id;
		name=name;
	}
	LogicStudent1(){
		System.out.println("Student()of class student");
	}
	LogicStudent1(int id){
		System.out.println("Student(int)");
	}
	LogicStudent1(String a,int v){
		System.out.println("Student(String int)");
	}
}
class Student1{
	public static void main(String[]args){
		LogicStudent1 s1=new LogicStudent1();
	     new LogicStudent1(10);
	     new LogicStudent1("ganesh",5);
		
	}
}