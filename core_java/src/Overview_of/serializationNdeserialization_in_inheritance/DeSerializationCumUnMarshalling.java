package Overview_of.serializationNdeserialization_in_inheritance;
import java.io.*;

public class DeSerializationCumUnMarshalling implements UnMarshallingCumDeSerialization {
	Employee employee;
	Developer developer;
	String filepath="D:\\java program\\module3\\core_java.txt";
	File file;
	FileInputStream fileInputStream;
	ObjectInputStream objectInputStream;
	@Override
	public void unMarshallingCumDeSerialization() {
		file =new File(filepath);
		try {
			fileInputStream=new FileInputStream(file);
			objectInputStream=new ObjectInputStream(fileInputStream);
			employee =(Employee)objectInputStream.readObject();
			System.out.println("Employee details");
			System.out.println("------------------");
			System.out.println("Employee Id:"+employee.getId());
			System.out.println("Employee Name:"+employee.getName());
			System.out.println("Employee Mail Id:"+employee.getMailId());
			System.out.println("Employee contactNumber::"+employee.getContactNumber());
			System.out.println();
			developer=(Developer)objectInputStream.readObject();
			System.out.println("Developer details");
			System.out.println("--------------------");
			System.out.println("Developer job Designation:"+developer.getJobDesignation());
			System.out.println("Developer job role:"+developer.getJobRole());
			System.out.println("Developer salary:"+developer.getSalary());
			System.out.println("Developer Incentive:"+developer.getIncentive());
			System.out.println("DE-serializtion operation performed successfully");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}