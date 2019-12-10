package Crud;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert {

	public void insertData() throws ClassNotFoundException,SQLException{
		ConnectionManager con = new ConnectionManager();
		Scanner s = new Scanner(System.in);
		int b=0,c=0,d=0,e=0,f=0;
		Pattern ppp = Pattern.compile("[0-9]*");
		//name
		String regexname = "[A-Z][a-z]*";
		Pattern patternname = Pattern.compile(regexname);
		System.out.println("Enter the Name");
		String name = s.next();
		Matcher matchname = patternname.matcher(name);
		//rollno
		 String regaxroll = "[0-9]*";
		 Pattern patternreg = Pattern.compile(regaxroll);
		System.out.println("Enter the Rollno");
		CharSequence rollno = s.next();
		Matcher matchroll = patternreg.matcher(rollno);
		//year
		String regaxyear = "[0-9]*";
		Pattern patternyear = Pattern.compile(regaxyear);
		System.out.println("Enter the Year");
		CharSequence year = s.next();
		Matcher matchyear = patternyear.matcher(year);
		//dept
		String regaxdept = "[a-zA-Z].*";
		 Pattern patterndept = Pattern.compile(regaxdept);
		System.out.println("Enter the Department");
		String dept = s.next();
		Matcher matchdept = patterndept.matcher(dept);
		//pass
		System.out.println("Enter the Password");
		CharSequence pass = s.next();
		Matcher matcher = ppp.matcher(pass);
		if(matchname.matches()) {
			 System.out.println("Valid Name");
			f=1;
		 }
		 else {
			 System.out.println("Invalid Name");
			
		 }
		if(matchroll.matches()) {
			 System.out.println("Valid Rollno");
			b=1;
		 }
		 else {
			 System.out.println("Invalid Rollno");
			
		 }
		if(matchyear.matches()) {
			 System.out.println("Valid Year");
			c=1;
		 }
		 else {
			 System.out.println("Invalid Year");
			
		 }
		if(matchdept.matches()) {
			 System.out.println("Valid Department");
			d=1;
		 }
		 else {
			 System.out.println("Invalid Department");
			
		 }
		if(matcher.matches()) {
			 System.out.println("Valid Password");
			e=1;
		 }
		 else {
			 System.out.println("Invalid Password");
			
		 }
		 if(f==1&&b==1&&c==1&&d==1&&e==1) {
		PreparedStatement st =(PreparedStatement)con.getConnection().prepareStatement("insert into student(NAME,ROLLNO,YEAR,DEPARTMENT,PASSWORD)values(?,?,?,?,?);");
		st.setString(1, name);
		st.setString(2, (String) rollno);
		st.setString(3, (String) year);
		st.setString(4, dept);
		st.setString(5, (String) pass);
		st.executeUpdate();
		CaseStudy a = new CaseStudy();
		a.choice();
		System.out.println("Insert Sucessful");
	}
		 else
		 {
			 System.out.println("Invalid");
		 }
	}
}
