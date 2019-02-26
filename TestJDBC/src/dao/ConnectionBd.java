package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionBd {

	private static Connection connection=null;
	private static ConnectionBd c=null;
	
	private ConnectionBd() {}
	
	public static Connection getConnection() {
		if(c==null) {
			c=new ConnectionBd();
			//connextin
			try{
				Class.forName("com.mysql.jdbc.Driver");				
				connection=DriverManager.getConnection("jdbc:mysql://localhost/base?characterEncoding=UTF-8","root","lhy940802");				

				System.out.println("yesssss");
				
			} catch (Exception e) {
				System.out.println("noooooo");
			}
		}
		return connection;
	}
/*	测试是否连接成功
 * 	
	public static void main(String[] args) {
		ConnectionBd.getConnection();
			
	}*/
}
