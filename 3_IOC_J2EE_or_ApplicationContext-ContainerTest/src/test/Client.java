package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//While Loading time 
		//1. Check xml Document
		//2. will create instance for singleton beans
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//if the scope is PROTOTYPE -- on user request only instance can be created.
		ap.getBean("t");
		ap.getBean("t");
	


		
	
	}

}
