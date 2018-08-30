package autoBean;

public class Car {
	private String[] carType;
	private String carColor;
	private CarEngine[] engine;
	
	
	
	public Car() {
		System.out.println("in car Bean");
	}
	public void setCarType(String[] carType) {
		this.carType = carType;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setEngine(CarEngine[] engine) {
		this.engine = engine;
	}
	
	public void printCarDetails() {
		for(String c:carType) {
		System.out.println("Model of Car & Color: " + c + " & " + carColor);
		}
		for(CarEngine e:engine) {
		System.out.println("Having "+e.getEngineMake()+" Engine of  2000bph. Made in year :" + e.getEngineYear());
		}
	}
	
}
