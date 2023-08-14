class program4//pre increment
{
public static void main(String[]args)
{
int a=7;
System.out.println(++a);
System.out.println(a);//8

int b=4;//pre decrement
System.out.println(--b);
System.out.println(b);//3

int x=11;//pre decrement
int y=--x + --x;
System.out.println(y);//19

int p=14;//pre increment
int q=12;
int r=++p + ++q + ++p + ++q;
System.out.println(r);//58

int i=19;//pre decrement
int j=17;
int k= --i + --j + --i + --j;
System.out.println(k);//66
}
}