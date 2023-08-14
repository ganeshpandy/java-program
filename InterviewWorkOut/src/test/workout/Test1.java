package test.workout;
import java.util.Scanner;
public class Test1 {
public static void main(String[] args) {
	String s1="aabbbcc";
	char[]c=s1.toCharArray();
	char temp=' ';
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c.length-1;j++) {
			if(c[j]>c[j+1]) {
				temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
			}
		}
	}
	String s2="";
	for(int i=0;i<c.length;i++) {
		if(c[i]!=c[i+1]) {
			s2=s2+c[i];
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	}
}

