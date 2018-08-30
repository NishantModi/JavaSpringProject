package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {

	public static void main(String[] args) {
		
		//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/autowire_byType.xml");
		//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/autowire_byName.xml");
		//Car car=(Car)ap.getBean("c");
		//car.printData();
		
		/*ApplicationContext ap=new ClassPathXmlApplicationContext("resources/autowire_Constructor.xml");
		Bus bus=(Bus)ap.getBean("b");
		bus.printData();*/
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/autowire_autodetect.xml");
		Bus bus=(Bus)ap.getBean("b");
		bus.printData();
	}

}
