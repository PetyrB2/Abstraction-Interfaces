package Refactored;

public interface DogInterface {
	// Interfaces assume abstraction but we can add abstract if we want
	// But we cannot add implemented methods.
	abstract void name();

	void species();

	void bark();

	void walk();
}