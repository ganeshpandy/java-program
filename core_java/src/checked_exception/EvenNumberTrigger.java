package checked_exception;

public class EvenNumberTrigger {
public static void checkNumber(int num)throws EvenNumberException{
	
	if(num%2==0) {
		throw new EvenNumberException();
	}
}
}
