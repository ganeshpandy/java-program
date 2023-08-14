import java.util.Scanner;
class DisplayNNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		LogicNumber refN=new LogicNumber();
		refN.nonStatic(n);
	}
}
class LogicNumber{
	public void nonStatic(int n){
		for(int i=1;i<=n;i++){
				System.out.println(i);
			}
		}
	}

