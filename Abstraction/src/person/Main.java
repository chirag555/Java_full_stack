package person;

public class Main {
	public static void main(String[] args) {
		Person john=new Vegan();
		john.speak();
		john.eat();
		john.breathe();
		john.message();
		Person mia=new NonVegan();
		mia.speak();
		mia.eat();
		mia.breathe();
		mia.message();
		
	}

}
