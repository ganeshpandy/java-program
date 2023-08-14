class RemoveSpace
{
	public static void main(String[]args)
	{
		String str="chennai city of india";
		char[]ch=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				str=str+ch[i];
		}
		
		System.out.println(str);
}
}

