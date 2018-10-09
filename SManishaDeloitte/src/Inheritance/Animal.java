package Inheritance;

public class Animal extends Object 
{
	boolean alive=true;
	public void eat()
	{
		System.out.println("Animal is Eating");
	}
	
	public void move(int distance)
	{
		System.out.println("Animal is moving" + distance +"distance");
	
	}


public class Bird extends Animal
{
	public void fly(int dist)
	{
		System.out.println("bird flies" +dist +"distance");
	}
	public void move(long dist)
	{
		System.out.println("Bird is moving" + dist +"distance");	
	}
}
}