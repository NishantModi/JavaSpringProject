package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable countryandcapitals;
	

	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}



	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}



	public void setCountryandcapitals(Hashtable countryandcapitals) {
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
