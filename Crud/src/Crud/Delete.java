package Crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	

	public void deleteData() throws SQLException, ClassNotFoundException {
		ConnectionManager con = new ConnectionManager();
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the Rollno");
		int id=s.nextInt();
		PreparedStatement st =con.getConnection().prepareStatement("delete from student where ROLLNO=?");
		st.setInt(id,2);
		st.executeUpdate();
		System.out.println("Delete Sucessfully");

		CaseStudy a = new CaseStudy();
		a.choice();
		
	}

}
