class ArithmeticOperation
{
	double f1;
	double f2;
	String arithmeticoperationname;
	ArithmeticOperation(double f1,double f2,String arithmeticoperationname)
	{
	this.f1=f1;
	this.f2=f2;
	this.arithmeticoperationname=arithmeticoperationname;
	}
public void addition(){
	double c=f1+f2;
	System.out.println(arithmeticoperationname+"Result:"+c);
}
}