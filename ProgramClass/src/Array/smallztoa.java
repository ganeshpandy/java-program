package Array;

public class smallztoa {
	public static void main(String[] args) {

		char arr[]=new char[26];
		char val='z';
		for(char i=0;i<arr.length;i++) {
			arr[i]=val;
			val--;
		}
		for(char i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
