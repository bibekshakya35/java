package org.eurokids.db;

import java.sql.SQLException;

import java.sql.*;

public class DbUtils {

	String connectionUrl="jdbc:mysql://localhost:3306/onlinejava";
	public static PreparedStatement getPreparedStatement(String sql)throws ClassNotFoundException,SQLException{
		PreparedStatement ps=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/eurokids";
		String user="root";
		String password=null;
		Connection con =DriverManager.getConnection(url,user,password);
		ps=con.prepareStatement(sql);
		return ps;
	}
	//public static void main(String[] args)throws ClassNotFoundException,SQLException{
		//getPreparedStatement("select * from admin");
	//	//System.out.println("hello");
	//}
}
