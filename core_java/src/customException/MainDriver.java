package customException;

public class MainDriver {
public static void main(String[] args) {
		try {
			InvalidAge.check(14);
		} catch (InvalidAgeExp e) {
			// TODO Auto-generated catch block
			System.out.println("caught the exception");
			
			System.out.println("Exception Occured:"+e);
			
		}

	}
	
}
