package beans;

public class Bus {

	private Engine engine;
	public Bus(Engine engine)
	{
		System.out.println("paramaterized Bus constructor");
		this.engine=engine;
	}
/*	
 	public Bus(){
		System.out.println("Default BUs Construtor");
	}
*/
	public void setEngine(Engine engine) {
		System.out.println("Setter Engine");
		this.engine=engine;
	}
	
	public void printData()
	{
		System.out.println("Bus ModelYear: "+ engine.getModelYear());
	}
}
