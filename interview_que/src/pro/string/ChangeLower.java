package pro.string;
public class ChangeLower {
public static void main(String[] args) {
	String s="HELLOWORLD";
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(ch[i]>=65 && ch[i]<=97) {
			ch[i]=(char) (ch[i]+32);
		}
	}
	for(int i=0;i<s.length();i++) {
		System.out.print(ch[i]);
	}
	
}
}
