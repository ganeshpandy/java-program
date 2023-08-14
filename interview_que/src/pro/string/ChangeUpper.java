package pro.string;
import java.util.*;
public class ChangeUpper {
public static void main(String[] args) {
	String s="hello";
	char[]ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(ch[i]>=97 && ch[i]<=122) {
			ch[i]=(char) (ch[i]-32);
		}
	}

	for(int i=0;i<s.length();i++) {
		System.out.print(ch[i]);
	}
	}
}

