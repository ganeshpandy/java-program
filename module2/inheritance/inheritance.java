class A{
	private static int staticVarible;
	private boolean nonStaticVariable;
	private statiic void staticMethod(){
		System.out.println("staticMethod");
	}
	private void nonStaticVariable(){
		System.out.println("nonStaticVariable");
	}
	}
class B extends A{
	
}
class Inheritance{
	public static void main(String[]args){
		System.out.println(A.staticVarible);//cte
		A.staticMethod();
		A a=new A();
		System.out.println(a.nonStaticVariable);
		a.nonStaticMethod();
		System.out.println(B.staticVarible);
		B.staticVarible();
		B b=new B();
		System.out.println(b.nonStaticVariable);
		b.nonStaticMethod();
	}
}