package SeparateCharNSymbol;
import java.util.*;
public class CharNSymbol {

	public static void main(String[] args) {
	System.out.println("Enter the value");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String upperCase="";
	String lowerCase="";
	String number="";
	String specialChar="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
			upperCase=upperCase+s.charAt(i)+"";
		}	
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			lowerCase=lowerCase+s.charAt(i)+"";
		}
		else if(s.charAt(i)>='0' &&s.charAt(i)<='9') {
			number=number+s.charAt(i)+"";
		}
		else {
			specialChar=specialChar+s.charAt(i);
		}
	}
	System.out.println("uppercase letters are:"+upperCase);
	System.out.println("lowerCase letters are:"+lowerCase);
	System.out.println("number are:"+number);
	System.out.println("specialChar are:"+specialChar);
	}

}
