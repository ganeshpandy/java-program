class StringMethods2//indexOf()
{
	public static void main(String[]args)
	{
		//indexOf()
		String str="developer";
		System.out.println(str.indexOf('v'));//2
		System.out.println(str.indexOf('h'));//-1
		int a=str.indexOf('e');
		int b=str.indexOf('e',a+1);
		int c=str.indexOf('e',b+1);
		System.out.println("1st:"+a+"2nd:"+b+"3rd:"+c);
		//lastIndexOf()
		System.out.println(str.lastIndexOf('p'));//6
		System.out.println(str.lastIndexOf('d'));//0
		int x=str.lastIndexOf('e');
		int y=str.lastIndexOf('e',x-1);
		int z=str.lastIndexOf('e',y-1);
		System.out.println("1st:"+x+"2nd:"+y+"3rd:"+z);
	}
}