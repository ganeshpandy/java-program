class StringMethods
{
	public static void main(String[]args)
	{
		String str="developer";
		System.out.println(str.charAt(4));//l
		//System.out.println(str.charAt(10));StringIndexOutOfBoundsException
		//length()
		String s1="computerscience";
		System.out.println(s1.length());//15
		//length()
		String s2="software engineer";
		System.out.println(s2.length());//17
		//toCharArray()
		String str2="testing";
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}