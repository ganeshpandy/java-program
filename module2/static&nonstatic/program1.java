class demo
{
	static int val=25;
	static double num=7.5;
	static void test()
	{
		System.out.println("test");
	}
	static void run()
	{
		System.out.println("run");
}
}
public class program1
{
	public static void main(String[]args)
	{
		System.out.println(demo.val);
		System.out.println(demo.num);
		demo.test();
		demo.run();
	}
}

