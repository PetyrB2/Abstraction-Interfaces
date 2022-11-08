package Refactored;

public class Refactored {

	public static void main(String[] args) {
		// Introduction
		System.out.println("==========================================================");
		System.out.println("Title: Refactored - Abstraction Using an Interface");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description: \n\tCreating a DogInterface we Implement it");
		System.out.println("\tto the other classes Chihuahua and Labrador making sure");
		System.out.println("\tthe methods are Implemented.");
		System.out.println("\tThere is some repetition here.");
		System.out.println("");
		System.out.println("\tThis is the same project organised into separate");
		System.out.println("\tClass files and a separate Interface file.");
		System.out.println("===========================================================\n");

		// Create a Chihuahua
		Chihuahua c = new Chihuahua();
		c.name();
		c.species();
		c.bark();
		c.walk();
		System.out.println("");

		// Create a Labrador
		Labrador l = new Labrador();
		l.name();
		l.species();
		l.bark();
		l.walk();
		System.out.println("");
	}
}
