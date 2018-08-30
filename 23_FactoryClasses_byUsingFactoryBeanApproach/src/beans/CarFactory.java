package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Object>{

	private String carName;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	@Override
	public Object getObject() throws Exception {
		Car c=(Car)Class.forName(carName).newInstance();
		return c;
	}
	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}
	@Override
	public boolean isSingleton() {
		return true;
	}

}
