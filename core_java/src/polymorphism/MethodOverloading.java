package polymorphism;

public class MethodOverloading {
	public static void test1() {
		System.out.println("Hi");
	}
	public static void test1(int a) {
		System.out.println(a);
	}
	public static void test1(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
public static void main(String[] args) {
	MethodOverloading.test1();
	MethodOverloading.test1(10);
	MethodOverloading.test1(10,20);
}
}
