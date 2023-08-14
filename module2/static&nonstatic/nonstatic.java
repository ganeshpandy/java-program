class sample
{
	int val=25;
	double num=7.5;
	void test()
	{
		System.out.println("executing test()....");
	}
	void run()
	{
		System.out.println("executing run()");
	}
}
	public class nonstatic
	{
		public static void main(String[]args)
		{
			sample s=new sample();
			System.out.println(s.val);
			System.out.println(s.ch);
			System.out.println(s.ch);
			s.test();
			s.run();
		}
	}