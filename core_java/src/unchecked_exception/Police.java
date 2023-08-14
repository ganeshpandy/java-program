package unchecked_exception;

public class Police {
public static void checkSpeed(int speed) {
	if(speed>60) {
		throw new OverSpeedException();
		}
	}
}
