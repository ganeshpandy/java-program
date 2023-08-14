class Demo
{
	static int a=10;
	int b=20;
	static void test()
	{
		System.out.println("executing test");
	}
	void disp()
	{
		System.out.println("executing disp");
	}
}
public class staticandnonstatic
{
	public static void main(String[]args)
	Demo ref=new Demo();
	System.out.println(Demo.a);
	System.out.println(ref.b);
	Demo.test();
	ref.disp();
}