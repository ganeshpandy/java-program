class method2
{
public static void main(String[]args)
{
call();
System.out.println("program starts");
call();
run();
System.out.println("program ends");
}
static void call()
{
System.out.println("called");
}
static void run()
{
	System.out.println("running");
}
}