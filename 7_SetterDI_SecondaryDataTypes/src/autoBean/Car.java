package autoBean;

public class Car {
	private String carType;
	private String carColor;
	private CarEngine engine;
	
	
	
	public Car() {
		System.out.println("in car Bean");
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setEngine(CarEngine engine) {
		this.engine = engine;
	}
	
	public void printCarDetails() {
		System.out.println("Model of Car & Color: " + carType + "&" + carColor);
		System.out.println("Having "+engine.getEngineMake()+" Engine of  2000bph. Made in year :" + engine.getEngineYear());
	}
	
}
