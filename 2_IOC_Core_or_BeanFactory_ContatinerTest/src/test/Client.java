package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		//find Resource or xml file
		Resource resource = new ClassPathResource("resources/spring.xml");
		// load resource reference here
		BeanFactory factory = new XmlBeanFactory(resource);
		//it will validate resource or xml document
		System.out.println("Document is Valid..");
		
		factory.getBean("t");
		//as the scope of this bean is SINGLETON,hence the object will be created only one time
		//even if we will call it multiple time  like below:
		factory.getBean("t");
		factory.getBean("t");
		/*Output would be like:
			Aug 16, 2018 3:30:25 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
			INFO: Loading XML bean definitions from class path resource [resources/spring.xml]
			Document is Valid..
			Test Constructor called */
		
		//	incase scope would be change to PROTOTYPE, it will create instance of multipple time for each user.
		
	
	}

}
