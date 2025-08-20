package com.tnsif.abstracteg;

public abstract class Trainer {
	abstract void session();
	abstract void checks();
	
	public void display() {
		System.out.println("TNS Capgemeni Training");
	}

}
