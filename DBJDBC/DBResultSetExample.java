package DBJDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBResultSetExample {

	public static void main(String[] args) {
		
		try {

		//Step-1 Connect database through connection 
		Connection conObj = DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","12345");
		System.out.println("Connection Object : "+conObj);		
		
		//Step-2 Create Statement Object
		Statement stmtObj = conObj.createStatement();
		
		//Step-3 Create Statement Query
		ResultSet rsObj = stmtObj.executeQuery("SELECT * FROM trainings.course");
		
		
		//Step-4 Create ResultSet Object to retrieve results if required.
		while(rsObj.next()) {
			System.out.println(rsObj.getString("COURSE_ID")+" "+rsObj.getString("NAME")+" "+rsObj.getString("DURATION"));
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}