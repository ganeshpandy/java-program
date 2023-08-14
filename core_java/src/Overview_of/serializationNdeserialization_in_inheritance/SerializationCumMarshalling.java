package Overview_of.serializationNdeserialization_in_inheritance;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationCumMarshalling implements MarshallingCumSerialization {
	Employee employee;
	Developer developer;
	String filepath="D:\\java program\\module3\\core_java.txt";
	File file;
	FileOutputStream fileOutputStream;
	ObjectOutputStream objectOutputStream;
	@Override
	public void marshallingCumSerialization() {
		employee =new Employee();
		employee.setId(1);
		employee.setName("javarani");
		employee.setMailId("javarani@gmail.com");
		employee.setContactNumber(9876543210l);
		developer=new Developer();
		developer.setJobDesignation("associate software engineer");
		developer.setJobRole("java-developer");
		developer.setSalary(10000);
		developer.setIncentive(5000);
		file=new File(filepath);
		try {
			fileOutputStream=new FileOutputStream(file);
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
			objectOutputStream.writeObject(developer);
			System.out.println("serialization operation performed successfully");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				objectOutputStream.flush();
				objectOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
