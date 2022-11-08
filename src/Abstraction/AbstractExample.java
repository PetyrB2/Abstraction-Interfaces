package Abstraction;

// Abstract Class setup for Dog
abstract class Dog {
	
	public void species() {
		System.out.println("Is a Dog.");
	}
	public void bark() {
		System.out.println("It goes Woof!");
	}
	
	public abstract void name();
	public abstract void walk();
}

class Chihuahua extends Dog {
	public void name() {
		System.out.println("Chispa");
		
	}
	public void walk() {
		System.out.println("Has been for a W.A.L.K");
	}
}

class Labrador extends Dog {
	public void name() {
		System.out.println("Goldie");
	}
	
	public void walk() {
		System.out.println("Has been for a W.A.L.K");
	}
}



public class AbstractExample {

	public static void main(String[] args) {
		// Intro
		System.out.println("=====================================");
		System.out.println("Title: Abstraction");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description: \n\tCreating an Abstract Class called Dog "
				+ "\n\twe extend it to the other classes ");
		System.out.println("\t\tChihuahua and Labrador "
				+ "\n\tsaving having to repeat our code. (DRY)");
		System.out.println("======================================\n");

		Chihuahua c = new Chihuahua();
		c.name();
		c.species();
		c.bark();
		c.walk();
		
		System.out.println("");
		
		Labrador l = new Labrador();
		l.name();
		l.species();
		l.bark();
		l.walk();
	}

}
