package Array;

public class smallatoz {
	public static void main(String[] args) {

		char arr[]=new char[26];
		char val='a';
		for(char i=0;i<arr.length;i++) {
			arr[i]=val;
			val++;
		}
		for(char i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
