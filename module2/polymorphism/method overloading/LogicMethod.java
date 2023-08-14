class LogicMethod{
	public static void display(char c,String s){
		System.out.println("statement1");
	}
	public static void display(int i,boolean b){
		System.out.println("statement2");
	}
	public static void display(boolean b,int i){
		System.out.println("statement3");
	}
}
class Method{
	public static void main(String[]args){
		LogicMethod.display('j',"java");
		LogicMethod.display(10,true);
		LogicMethod.display(true,10);
	}
}