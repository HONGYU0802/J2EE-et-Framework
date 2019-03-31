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
				connection=DriverManager.getConnection("jdbc:mysql://localhost/base1?characterEncoding=UTF-8","root","lhy940802");				

				System.out.println("Connection BD Bon");
				
			} catch (Exception e) {
				System.out.println("PAS connection BD");
			}
		}
		return connection;
	}
	//测试是否连接成功
  	
	public static void main(String[] args) {
		ConnectionBd.getConnection();
			
	}
}
