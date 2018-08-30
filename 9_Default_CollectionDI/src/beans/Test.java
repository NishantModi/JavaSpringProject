package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set cricketers;
	private Map countryandcapitals;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setCountryandcapitals(Map countryandcapitals) {
		this.countryandcapitals = countryandcapitals;
	}
	
	public void printData()
	{
		System.out.println("fruits...............");
		for(Object fruit:fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Cricketers...............");
		for(Object c:cricketers) {
			System.out.println(c);
		}
		
		System.out.println("Countries and Capitals...............");
			Set keys=countryandcapitals.keySet();
			for(Object key:keys) {
				System.out.println("Country: "+key+" &  Capital: "+countryandcapitals.get(key));
			}
	}
}
