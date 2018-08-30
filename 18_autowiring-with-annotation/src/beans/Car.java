package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("engine")
	private Engine engine;
	
	//No need to have setter or constructor 
	
	public void printData()
	{
		System.out.println("EngineModelYear: "+engine.getModelYear());
	}
}
