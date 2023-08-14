package polymorphism;

public class NonStaticMethodOverloading {
public void test1() {
	System.out.println("hi");
}
public void test1(int a) {
	System.out.println(a);
}
public void test1(int a,int b) {
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
NonStaticMethodOverloading ref=new NonStaticMethodOverloading();
ref.test1();
ref.test1(10);
ref.test1(20,30);

}
}
