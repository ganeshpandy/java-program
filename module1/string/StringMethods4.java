class StringMethods4
{
	public static void main(String[]args)
	{
	String str="Developer";
	System.out.println(str.substring(4));
	System.out.println(str.substring(3,8));//elope
	System.out.println(str.substring(0,7));//Develope
	String[] arr= str.split("");
	System.out.println(arr);
	}
}