package customException;
public class InvalidAge {
	public static void check(int age)throws InvalidAgeExp {
		if(age<18) {
			throw new InvalidAgeExp("age is not valid to vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}
}
