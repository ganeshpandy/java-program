class A{
	public void display(){
		System.out.println("statement1");
	}
	public void display(int a){
		display();
		System.out.println("statement2");
	}
	public void display(int a,int b){
		display(10);
		System.out.println("statement3");
	}
	public void display(int a,int b,int c){
		display(10,20);
		System.out.println("statement4");
	}
}
class MethodChain{
	public static void main(String[]args){
		A refA=new A();
		refA.display(10,20,30);
	}
}