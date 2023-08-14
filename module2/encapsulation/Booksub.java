import java.util.Scanner;
class Booksub
{
	static Book book;
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		boolean data=true;
		do
		{
			System.out.println("select your choice");
			System.out.println("-------------------");
			System.out.println("1.Press 1 to create the book");
			System.out.println("2.Press 2 to Read the book");
			System.out.println("3.Press 3 to Update the book");
			System.out.println("4.Press 4 to Delete the book");
			System.out.println("5.Press 5 to Exit");
			int choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
				{
					book=new Book();
					System.out.println("book object Reference"+book);
					System.out.println("book create operation performed successfully");
				}
				break;
				case 2:
				{
					System.out.println("book details");
					System.out.println("--------------");
					System.out.println("Book Id:"+book.getId());
					System.out.println("Book price:"+book.getprice());
					System.out.println("Book Name:"+book.getName());
					System.out.println("book Read operation performed successfully");
				}
				break;
				case 3:
				{
					System.out.println("Enter the book id");
					int id=scanner.nextInt();
					book.setId(id);
					System.out.println("Enter the Book price");
					double price=scanner.nextDouble();
					book.setprice(price);
					System.out.println("enter the Book name:");
					String name=scanner.next();
					book.setName(name);
					System.out.println("book upadte operation performed successfully");
				}
				break;
				case 4:
				{
					book=null;
					System.out.println("book object reference:"+book);
					System.out.println("Book delete operation performed successfully");
				}
				break;
				case 5:
				{
					data=false;
					System.out.println("Thank you");
				}
				break;
				default:
				{
					System.out.println("Invalid choice try again");
				}
				break;
			}
		}while(data);
	}
}