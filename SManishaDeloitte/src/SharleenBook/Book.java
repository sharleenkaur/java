package SharleenBook;

public class Book
{
	
		public int pages;
		public String title,author,publisher;
		public int current_page;
		
		public Book( int p,String t,String a,String pub,int curr)
		
		{
			pages=p;
			title=t;
			author=a;
			publisher=pub;
			current_page=curr;
		}
		
		public boolean isOpen(int page)
		{
			if(page!=0)
				return true;
			else
				return false;
		}
		
		public boolean isClose(int page)
		{
			if(page==0)
				return true;
			else
				return false;
		}
		public int open(int c)
		{
		current_page=c;
		return current_page;
		}
		public int open()
		{
		current_page=1;
		return current_page;
		}
		
		public void close()
		{
		current_page=0;
		}
		public void turnleft()
		{
			
		}
	
}
