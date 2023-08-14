abstract class LogicA{
	static int staticVariable;
	int nonStaticVariable;
	LogicA(){
		System.out.println("A()of class A");
	}
	LogicA(int nonStaticVariable){
		System.out.println("A(int)of class A");
	}
	public static void staticMethod(){
	System.out.println("staticMethod()of class A");	
	}
	public abstract void nonStaticMethod(){
	System.out.println("nonstaticMethod()of class A");	
	}
	static{
	System.out.println("static block of class A");		
	}
	{
		System.out.println("non static block of class A");	
	}
}
class A{
	public static void main(String[]args){
		LogicA refA=new LogicA();
		
	System.out.println(LogicA.staticVariable);
LogicA.staticMethod();	
	}
}