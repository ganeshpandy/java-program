package pro.string;

public class RemoveDupString {
public static void main(String[] args) {
	String s1="abbaac";
	char[] c= s1.toCharArray();
	char temp=' ';
	for(int i=0;i<=c.length-1;i++) {
		for(int j=0;j<=c.length-2;j++) {
			if(c[j]>c[j+1]) {
				temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
				}
			}
		}
	String s2="";
	for(int i=0;i<=c.length-2;i++) {
		if(c[i]!=c[i+1]) {
			s2=s2+c[i];
		}
	}
	s2=s2+c[c.length-1];
	//print the result
System.out.println(s2);	
}
}
