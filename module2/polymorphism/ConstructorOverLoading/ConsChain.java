class Cons{
	int id;
	String name;
	Cons(){
		//super(1,"java");
		System.out.println("cons()");
	}
	Cons(int id){
		this();
		System.out.println("cons(id)");
	}
	Cons(int id,String name){
		this(id);
		System.out.println("cons(id,name)");
	}
}
class ConsChain{
	public static void main(String[]args){
		Cons c=new Cons(1,"java");
	}
}