class Developer{
private int id;
private String name;
private String designation;
Developer(int id,String name, String designation)
{
	this.id=id;
	this.name=name;
	this.designation=designation;
}
public int getid()
{
	return id;
}
public void setid(int id)
{
	this.id=id;
}
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.name=name;
}
public String getdesignation()
{
	return designation;
}
public void setdesignation(String designation)
{
 this.designation=designation;
}
public void displayDeveloperDetails()
{
	System.out.println("developer details");
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
}
}
