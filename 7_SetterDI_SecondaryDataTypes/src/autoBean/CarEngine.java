package autoBean;

public class CarEngine {
	private String engineYear;
	private String engineMake;
	public CarEngine() {
		System.out.println("in carEngine Bean");	
	}
	//Here we need setter and getter both 
	//Setter to set the values received by XML file
	// Getters: for the data consumed by to Car class.

	public String getEngineYear() {
		return engineYear;
	}
	public void setEngineYear(String engineYear) {
		this.engineYear = engineYear;
	}
	public String getEngineMake() {
		return engineMake;
	}
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}
	

	
	
}
