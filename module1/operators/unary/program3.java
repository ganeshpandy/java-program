class program3//post increment

{
public static void main(String[]args)
{
int p=13;
int q=15;
int r=p++ + q-- + p++ + q++;
System.out.println(r);//56


int i=23;
int j=27;
int k=i++ + j-- + j-- + i++;
System.out.println(k);//100


}
}