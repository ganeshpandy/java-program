class countofdigit
{
public static void main(String[]args)
{
int num=12;
int digit=0;
do
{
digit++;
num=num/10;
}
while(num>0);
System.out.println(digit);
}
}