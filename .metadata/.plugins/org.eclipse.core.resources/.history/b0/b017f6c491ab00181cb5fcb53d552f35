package beans;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

public class CarFactory {

	public static String carName;

	public static void setCarName(String carName) {
	CarFactory.carName = carName;
	}

	public static Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	Car c=(Car)Class.forName(carName).newInstance();
	return c;
	}
}
