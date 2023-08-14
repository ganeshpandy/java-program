class EncapulationSub
{
	public static void main(String[]args)
	{
		Encapulation Encapulation=new Encapulation();
		System.out.println("project object reference"+Encapulation);//reference
		System.out.println("project object Id"+Encapulation.getId);//cts
		System.out.println("project object reference"+Encapulation.getName);//cts
		Encapulation.setId(1);
		Encapulation.setName("java");
		System.out.println("project object id"+Encapulation.getId);//cts
		System.out.println("project object name"+Encapulation.getName);//cts
	}
}