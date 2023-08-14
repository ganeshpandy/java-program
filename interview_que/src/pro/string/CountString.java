package pro.string;

public class CountString {
public static void main(String[] args) {
	String s1="ababcca";
	char[] ch= s1.toCharArray();
	//sorting of array
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch.length-1;j++) {
			if(ch[j]>ch[j+1]) {
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
	}
	//logic for occurance
	int count=1;
	for(int i=0;i<ch.length-1;i++) {
		if(ch[i]==ch[i+1]) {
			count++;
		}
		else {
			System.out.println(ch[i]+"="+count);
			count=1;
		}
	}
	System.out.println(ch[ch.length-1]+"="+count);
	}
}
