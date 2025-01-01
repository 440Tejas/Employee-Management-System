package com.ems.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection { 
	  
	public Connection getConnection() {
		Connection con = null;
		try {
		     String url="jdbc:mysql://localhost:3306/emsdb";
		     String uname="root";
		     String password1="1234";
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     con=DriverManager.getConnection(url,uname,password1);
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
