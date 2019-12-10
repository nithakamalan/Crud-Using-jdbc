package Crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public void updateData() throws SQLException, ClassNotFoundException {
		ConnectionManager con = new ConnectionManager();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Rollno");
		int rollno1 = s.nextInt();
		System.out.println("Enter the  Name");
		String name = s.next();
		System.out.println("Enter the Rollno");
		int rollno = s.nextInt();
		System.out.println("Enter the Year");
		int year = s.nextInt();
		System.out.println("Enter the Department");
		String dept = s.next();
		System.out.println("Enter the PASSWORD");
		int pass = s.nextInt();
		PreparedStatement st =(PreparedStatement)con.getConnection().prepareStatement("update student set NAME=?,ROLLNO=?,YEAR=?,DEPARTMENT=?,PASSWORD=? where PASSWORD=?");
		st.setString(1, name);
		st.setInt(2, rollno);
		st.setInt(3, year);
		st.setString(4, dept);
		st.setInt(5, pass);
		st.setInt(6, rollno1);
		st.executeUpdate();
		System.out.println("update Sucessful");
		CaseStudy a = new CaseStudy();
		a.choice();
		
	}

}
