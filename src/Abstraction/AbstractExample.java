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
		// TODO Auto-generated method stub

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
