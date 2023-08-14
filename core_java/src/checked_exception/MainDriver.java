package checked_exception;

public class MainDriver {

	public static void main(String[] args) {
	try {
		EvenNumberTrigger.checkNumber(25);
		EvenNumberTrigger.checkNumber(30);
		EvenNumberTrigger.checkNumber(50);
		}
	catch(EvenNumberException e) {
		e.printStackTrace();
	}
	}
}
