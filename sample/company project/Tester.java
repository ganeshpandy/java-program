class Tester
{
private int testerId;
private String testerName;
private String testerDesignation;
Tester(int testerId,String testerName, String testerDesignation)
{
	this.testerId=testerId;
	this.testerName=testerName;
	this.testerDesignation=testerDesignation;
}
public int getid()
{
	return testerId;
}
public void setid(int testerId)
{
	this.testerId=testerId;
}
public String getname()
{
	return testerName;
}
public void setname(String testerName)
{
	this.testerName=testerName;
}
public String getdesignation()
{
	return testerDesignation;
}
public void setdesignation(String testerDesignation)
{
 this.testerDesignation=testerDesignation;
}
public void displayTesterDetails()
{
	System.out.println("developer details");
	System.out.println(testerId);
	System.out.println(testerName);
	System.out.println(testerDesignation);
}
private Developer Developer;
public Developer getDeveloper()
{
	return Developer;
}
public void setDeveolper(Developer Developer)
{
	this.Developer=Developer;
}
}