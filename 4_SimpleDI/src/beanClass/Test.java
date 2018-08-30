/**
 * 
 */
package beanClass;

/**
 * @author Nishant
 *
 */
public class Test {
	private String salutation;

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	public void sayHello(String name) {
		System.out.println("Hello " + salutation + " " + name  );
	}
}
