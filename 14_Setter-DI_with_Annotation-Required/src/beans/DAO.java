package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class DAO {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void printConn() throws Exception{
		Class.forName(driver);
		//ForOracle
		Connection con = DriverManager.getConnection(url, username, password);

		//For mySql
		Connection con1 = DriverManager.getConnection(url);
		
		System.out.println(con1);
	}
}
