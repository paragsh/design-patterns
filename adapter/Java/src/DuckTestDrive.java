import example1.Duck;
import example1.MallarDuck;
import example1.TurkeyObjectAdapter;
import example1.WildTurkey;


public class DuckTestDrive {
	public static void main(String[] args){
		MallarDuck duck = new MallarDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyObjectAdapter(turkey);

		System.out.println("The Turkey Says.....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("========================================");
		
		System.out.println("\nThe Duck Says.....");
		testDuck(duck);
		
		System.out.println("========================================");
		
		System.out.println("\nThe TurkeyAdapeter Says.....");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
