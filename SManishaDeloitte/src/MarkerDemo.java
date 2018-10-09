import sushree_package.Marker;
import java .util.Date;
public class MarkerDemo {
	
	public static void main(String[] args)
	{
		Marker a=new Marker("black","reynolds",25);
		Marker b=new Marker("blue","camlin",20);
		Date d=new Date();
       
        System.out.println(a.color);
        System.out.println(b.color);
        
        System.out.println(d);
        System.out.println(a.toString());
        System.out.println(b.toString());
 
	}
	
	public static void main1(String[] args)
	{
		Marker a=new Marker("black","reynolds",25);
		Marker b=new Marker("blue","camlin",20);
       
        System.out.println(a.color);
        System.out.println(b.color);
        
        System.out.println(a.category);
        System.out.println(b.category);
        
        a.color="red";
        b.color="green";
        
        a.category="Stationary";
        b.category="Writing Instruments";
        
        System.out.println(a.color);
        System.out.println(b.color);
        
        System.out.println(a.category);
        System.out.println(b.category);
        
        
	}
	public static void main2(String args[])
	{
		Marker a=new Marker("black","reynolds",25);
		Marker b=new Marker("blue","camlin",20);
		System.out.println(a.color + " "+a.brand);
		System.out.println(b.color + " "+b.brand);
	}
	
	
	}
	  
