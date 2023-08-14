class static1
{
	public static int demo(int a)
	{
		system.out.println("static demo(int)");
		return 10;
	}
	static
	{
		system.out.println("static block");
	}
	static double a;
	static float b=15.15f;
	static
	{
		system.out.println("core java");
	}
	public static string display()
	{
		system.out.println("static display()");
		return "java";
	}
	public boolean addition(int a)
	{
		system.out.println("non-static addition(int)");
		return false;
	}
	{
	system.out.println("non-static block");
	}
	double flag1;
	double flag2;
}