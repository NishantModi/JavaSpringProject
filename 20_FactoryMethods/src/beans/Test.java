package beans;

public class Test {
	private static Test t;
	
	private Test() {
		System.out.println("Test private consturctor object");
	}
	
	//for singleton Class object
	public static Test getInstance()
	{
		if(t==null) {
			t=new Test();
			return t;
		}
		else {
			return t;
		}
		//incase of singleton, also need to restrict clonable access
		//we need to override clone method
		/*protected Object clone() throws CloneNotSupportedException{
			throw new CloneNotSupportedException();*/
		}
		
	}
	
