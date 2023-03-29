package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JDBCExample {
	
	 private final String url = "jdbc:postgresql://localhost/Employee";
	 private final String user = "postgres";
	 private final String password = "12345";

	    /**
	     * Connect to the PostgreSQL database
	     * @return a Connection object
	     */
	    public Connection connect() {
	        Connection conn = null;
	        Employee e = null;
	        ArrayList<Employee> employeeList = new ArrayList<Employee>(100);
	       try {
	        	//Step-1 Using connection interface get the Database connection.
	        	// DriverManager is a class which internally & indirectly implemented Connection Intreface
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the PostgreSQL server successfully.");
	            
	            //Step-2 Using Connection Interface create a statement object and using statment Object pass the query to database
	            Statement stmt = conn.createStatement();
	            
	            //Step-3 Using Statement object it will return result set
                ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
                
                //Step-4 Iterate Result set
                while(rs.next()) {
                	//System.out.print(rs.getInt(1)+ "\t\t"+ rs.getString(2)+ "\t\t\t"+rs.getString(3));
                	e = new Employee(rs.getInt(1),rs.getString("name"),rs.getString("address"));
                	employeeList.add(e);
                }
                
               
                   // How to retrieve items from the list?
                   // Using iterator
                
                  /*for(Employee ie : employeeList) {
                	  System.out.println("Iterator ie Address= "+ie.getAddress());
                	  System.out.println("Iterator ie Employee Name = "+ie.getEmployeeName());
                	  System.out.println("Iterator ie Employee Id = "+ie.getId());
                	  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                  }*/
                
                // Old way of Iteration
                
                Iterator<Employee> iterator = employeeList.iterator();
                
                while(iterator.hasNext()) {
                	System.out.println("***********************");
                	Employee empTempObj = iterator.next();
                	System.out.println(empTempObj.getAddress());
                	System.out.println(empTempObj.getEmployeeName());
                }
       
                
	        } catch (SQLException ex) {
	          //  System.out.println(ex.getMessage());
	        }

	        return conn;
	    }
	
	    
	    public static void main(String args[])
	    {
	    	JDBCExample obj = new JDBCExample();
	    	obj.connect(); }