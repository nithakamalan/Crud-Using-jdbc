package Crud;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectionManager {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {//throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = null;
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentt","root","");
		if(con!=null)
		{
			return con;
		}
		else {
			return null;
		}
		
		
		
	}

	
	}

	
	

	


