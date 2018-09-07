package com.java.singtel;

public class Parrot extends Bird{
 
   Animal animal;
   void livingWith(Animal animal)
   {
	 this.animal =animal;
	  
   }
   public boolean fly() {
		System.out.println("I am flying");
		return true;
		}

	  public boolean sing() {

		animal.sing();
		return true;
	}

	@Override
	public boolean walk() {
		
			System.out.println("I am walking");
		
		return true;
	}
}
