class a{
	int a=10;
	void nonStaticOfClassA(){
		System.out.println("non static method");
	}
}
	class b{
		int b=20;
		void nonStaticOfClassB(){
			System.out.println("non static method2");
		}
	}
class StaticAndNonStatic{
	public static void main(String[]args){
		a refA=new a();
		b refB=new b();
		System.out.println(refA.a);
		System.out.println(refB.b);
		refA.nonStaticOfClassA();
		refB.nonStaticOfClassB();
	}
}
	
