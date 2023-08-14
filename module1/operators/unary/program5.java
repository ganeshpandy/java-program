class program5
{
public static void main(String[]args)
{
int a=13;
int b=17;
int c=--a + ++b + --a + ++b;
System.out.println(c);//60

int x=24;
int y=24;
int z= ++x + --y + ++x + --y;
System.out.println(z);

int i=12;
int j=17;
int k=i++ + ++j + ++i + ++j;
System.out.println(k);//62

int p=10;
int q=p++ + ++q;
System.out.println(q);//22
 
 int d=7;
 int e=++d + e++;
 System.out.println(e);//16
 System.out.println(++8);

}
}