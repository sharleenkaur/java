package sushree_package;

public class Marker {
	private double price;
	public final String brand;
	public String color;
	
	public Marker(String c,String b,double p)
	{
	brand=b;
	color=c;
	price=p;
	}
	public double getPrice(){
		return price;}
	public void setPrice(double price)
	{
		if(price>0)
			price=price;
		else
			System.out.println("Invalid price");
	}
		
		public static String category="pens";
	

}
