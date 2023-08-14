package AscEven.java;

public class AscEven {

	public static void main(String[] args) {
System.out.println("The even ascKey code are:");
for(char a='a';a<='z';a++) {
	int c = a ;
	if(c%2==0) {
		System.out.println(a+" ASCIICODE "+c);
	}
}
System.out.println("The odd ascKey code are:");
for(char a='a';a<='z';a++) {
	int d = a ;
	if(a%2!=0) {
		System.out.println(a+" ASCIICODE "+d);
	}
}
	}

}
