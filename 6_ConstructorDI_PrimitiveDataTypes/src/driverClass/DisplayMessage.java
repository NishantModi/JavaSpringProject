package driverClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanClass.Test;

public class DisplayMessage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/input.xml");
		
		Test o =(Test)ap.getBean("t");
		o.printData();

	}

}
