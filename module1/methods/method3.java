class method3
{
public static void main(String[]args)
{
send();
System.out.println("program starts");
push();
run();
System.out.println("program ends");
}
static void send()
{
System.out.println("called");
}
static void run()
{
	System.out.println("running");
}
static void push()
{
System.out.println("pushed");
}

}