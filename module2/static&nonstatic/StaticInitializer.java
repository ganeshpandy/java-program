class StaticInitializer
{
	static int i;
	public static void demo(){
		System.out.println("static demo()");
		}
		static int a=10;
		static {
			System.out.println("static block");
		}
		public static void main(String[]args){
			System.out.println("main()starts");
			System.out.println(i);
			demo();
			System.out.println("main()ends");
			}
}