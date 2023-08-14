package unchecked_exception;

public class TestDriver {
public static void main(String[] args) {
	try {
		Police.checkSpeed(65);
		Police.checkSpeed(45);
	}
	catch(OverSpeedException e){
		e.printStackTrace();
	}
}
}
