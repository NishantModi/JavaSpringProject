package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {

	@Autowired
	private Engine engine;
	//No need to have setter or constructor 
	
	public void printData()
	{
		System.out.println("Bus ModelYear: "+ engine.getModelYear());
	}
}
