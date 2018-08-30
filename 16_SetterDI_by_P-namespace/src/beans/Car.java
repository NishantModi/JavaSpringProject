package beans;

public class Car {
	private String carName;
	private Engine carEngine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	public void printData(){
		System.out.println(carName);
		System.out.println(carEngine.getModelYear());
	}
}
