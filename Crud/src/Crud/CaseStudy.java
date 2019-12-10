package Crud;
import java.sql.SQLException;
import java.util.Scanner;

import Crud.ConnectionManager;
import Crud.Delete;
import Crud.Insert;
import Crud.Login;
import Crud.Update;
import Crud.View;


public class CaseStudy {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		ConnectionManager con = new ConnectionManager();
		CaseStudy a = new CaseStudy();
		a.choice();
	}
	public void choice() throws ClassNotFoundException,SQLException{
		Scanner s = new Scanner(System.in);
		System.out.println("1.Insert\n2.View\n3.Update\n4.Delete\n5.Login\6.Exit");
		int n = s.nextInt();
		switch(n) {
		
		case 1:
			Insert insert= new Insert();
		   insert.insertData();
		   break;
		case 2:
			View view= new View();
		   view.viewData();
		   break;
		case 3:
			Update update= new Update();
			   update.updateData();
			   break;
		case 4:
			Delete delete= new Delete();
			delete.deleteData();
			break;
		case 5:
			Login login= new Login();
			login.loginData();
			break;
			
		default :
			
			System.exit(0);
		}
		

	}



}