package test;
import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		//find xml
		Resource r = new ClassPathResource("resources/spring.xml");
		//load xml into container
		BeanFactory factory = new XmlBeanFactory(r);
		
		//create test class object
		Object o=(Test)factory.getBean("t");
		Object o1=(Test)factory.getBean("t");
		Object o2=(Test)factory.getBean("t");
		
		// to compare 2 object
		System.out.println(o==o1);
		System.out.println(o1==o2);
		Test t = (Test) o;
		t.hello();
	}

}
