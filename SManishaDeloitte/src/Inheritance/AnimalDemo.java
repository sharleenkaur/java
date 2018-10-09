package Inheritance;

import Inheritance.Animal.Bird;

public class AnimalDemo {
	public static void main(String args[])
	{
		Bird b1=new Bird();
		b1.move(500L);
	}
	
	
	
	
	
	public static void main1(String[] args)
	{
		Bird b1=new Bird();
		
		b1.eat();
		b1.fly(200);
	}
	public static void main2(String args[])
	{
		Animal a1= new Animal();
	System.out.println(a1.alive);
	a1.eat();
	a1.move(120);
	}

}
