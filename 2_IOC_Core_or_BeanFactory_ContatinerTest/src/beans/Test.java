package beans;

public class Test {

	//to test IOC instantiation create only constructor.
	//As constructor is only getting called when objects are created by IOC
	// either while "singleton" (loading) or "Prototype"( user request).
	public Test () {
		System.out.println("Test Constructor called");
	}
}
