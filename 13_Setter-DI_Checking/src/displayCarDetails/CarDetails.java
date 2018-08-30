package displayCarDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autoBean.Car;

public class CarDetails {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// to load two or more xml at the same time we have to create a files array.
		String xmlFiles[]=new String[] {"carResources/car.xml","carResources/engine.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(xmlFiles);
		Car c = (Car) ap.getBean("car");
		c.printCarDetails();
	}

}
