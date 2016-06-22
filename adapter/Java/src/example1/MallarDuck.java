package example1;

public class MallarDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
