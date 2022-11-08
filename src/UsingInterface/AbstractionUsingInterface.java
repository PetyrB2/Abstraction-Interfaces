package UsingInterface;

interface DogInterface {
	void name();

	void species();

	void bark();

	void walk();
}

class Chihuahua {
	public void name() {
		System.out.println("Chispa");
	}

	public void species() {
		System.out.println("Is a Dog.");
	}

	public void bark() {
		System.out.println("Goes WOOF!");
	}

	public void walk() {
		System.out.println("Has been for a W.A.L.K");
	}
}

class Labrador implements DogInterface {
	public void name() {
		System.out.println("Goldie");
	}

	public void species() {
		System.out.println("Is a Dog.");
	}

	public void bark() {
		System.out.println("Goes WOOF!");
	}

	public void walk() {
		System.out.println("Has been for a W.A.L.K");
	}
}

public class AbstractionUsingInterface {

	public static void main(String[] args) {
		// Intro
		System.out.println("==========================================================");
		System.out.println("Title: Abstraction Using an Interface");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description: \n\tCreating a DogInterface we Implement it");
		System.out.println("\tto the other classes Chihuahua and Labrador making sure");
		System.out.println("\tthe methods are Implemented.");
		System.out.println("\tThere is some repetition here.");
		System.out.println("===========================================================\n");
		

		// Create a Chihuahua
		Chihuahua c = new Chihuahua();
		c.name();
		c.species();
		c.bark();
		c.walk();

		System.out.println("");
		// Create a Lab
		Labrador l = new Labrador();
		l.name();
		l.species();
		l.bark();
		l.walk();
	}

}
