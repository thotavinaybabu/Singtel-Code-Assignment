package com.java.singtel;

public class Parrot extends Bird{
 
   Animal animal;
   void livingWith(Animal animal)
   {
	 this.animal =animal;
	  
   }
   public void fly() {
		System.out.println("I am flying");
		}

	  public void sing() {

		animal.sing();
	}

	@Override
	public void walk() {
		
			System.out.println("I am walking");
		
		
	}
}
