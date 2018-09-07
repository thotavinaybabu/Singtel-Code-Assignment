package com.java.singtel;

public class Dog implements Animal{

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		
	}

	@Override
	public boolean sing() {
		System.out.println("Woof, woof");
		return true;
		
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can swim");
		return true;
	}

}
