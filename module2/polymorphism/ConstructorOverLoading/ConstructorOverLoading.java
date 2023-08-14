class Constructor{
	int id;
	String name;
	long mobileNo;
	Constructor(){
		System.out.println("student()of class student");
	}
	Constructor(int id,String name){
		System.out.println("student(id,name)of class student");
	}
	Constructor(long mobileNo,String name){
		System.out.println("student(mobileNo,Name)of class student");
	}
	Constructor(long mobileNo,int id){
		System.out.println("student(mobileNo,id)of class student");
	}
}
class ConstructorOverLoading{
	public static void main(String[]args){
		Constructor co1=new Constructor();
		Constructor co2=new Constructor(10,"java");
		Constructor co3=new Constructor(12345,001);
		
	}
}