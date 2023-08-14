package Serialization;
import java.io.*;
public class Employee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
    Details d=new Details(1, "John"); 
    String filename="index.txt";
    FileOutputStream fos=new FileOutputStream(filename);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);
	System.out.println("Object is serialized..");
		
    FileInputStream fis=new FileInputStream(filename);
    ObjectInputStream ois=new ObjectInputStream(fis);
    d=(Details)ois.readObject();
    System.out.println("Deserialized..");
	System.out.println("eid is : "+d.empid);
	System.out.println("Ename is :"+d.ename);
		
	}

}
class Details implements Serializable
{
	int empid; 
	String ename; 
	public  Details(int empid, String ename)
	{
		this.empid=empid; 
		this.ename=ename; 
	}
	
}
