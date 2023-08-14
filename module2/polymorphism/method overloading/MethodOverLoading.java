class LogicMethod{
	public static void add(){
		System.out.println("state1");
	}
	public static void add(int a){
		System.out.println("state2");
	}
	public static void add(int a,int b){
		System.out.println("state3");
	}
}
class MethodOverLoading{
	public static void main(String[]args){
		LogicMethod.add();
		LogicMethod.add(10);
		LogicMethod.add(10,20);
	}
}