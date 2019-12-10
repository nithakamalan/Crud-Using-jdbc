package Crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {

	
 
		ConnectionManager con = new ConnectionManager();
		void viewData()throws SQLException, ClassNotFoundException {
			//callable Statement
		Statement s1 = (Statement) con.getConnection().createStatement();
		ResultSet r = s1.executeQuery("select * from student");
		while(r.next())
		{
			System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getInt(3)+" "+r.getString(4)+" "+r.getInt(5));
		}
		CaseStudy a = new CaseStudy();
		a.choice();
		
	}

}
