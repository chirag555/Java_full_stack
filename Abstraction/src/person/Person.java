package person;

public abstract class Person implements IsAlive,LiveLife{

	public void speak() {
		System.out.println("Share thoughts ");
	}
	
	public abstract void eat();
	@Override
	public void breathe() {
		System.out.println("breathing is good");
	}
	@Override
	public void message() {
		System.out.println("Life is a simulation");
	}
}
