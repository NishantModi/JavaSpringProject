/**
 * 
 */
package beanClass;

/**
 * @author Nishant
 *
 */
public class Test {
	private String name;
	private int age;
	private String email;
	public void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
	}
	//Constructor can be public or private as IOC has the ability to read both kind or constructor
	private Test(String name, int age, String email ) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
}
