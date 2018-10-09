package SharleenBook;
import SharleenBook.Book;
public class BookDemo {
	public static void main(String args[])
	{
		Book b1=new Book(150,"alice to wonderland","lewis caroll","macmillan publishers",0);
		Book b2=new Book(300,"University Physics","S.Prasad","Pearson publishers",44);
		 
		if(b1.isClose(b1.current_page))
		{
			b1.current_page=b1.open();
			System.out.println(b1.title+ " is open at "+ b1.current_page);
		}
		else
			System.out.println(b1.title+ " is open at "+ b1.current_page);
	
		if(b2.isClose(b2.current_page))
		{
			b2.current_page=b2.open();
			System.out.println(b2.title+ " is open at "+ b2.current_page);
		}
		else
			System.out.println(b2.title+ " is open at "+ b2.current_page);
	
	}

}