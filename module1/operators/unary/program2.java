class program2//post increment

{
public static void main(String[]args)
{
int p=7;
int q=p++ + p++;
System.out.println(q);//15


int i=5;
int j=i-- + i--;
System.out.println(j);//9

int x=17;
int y=14;
int z=x-- +y-- + x-- + y--;
System.out.println(z);

}
}