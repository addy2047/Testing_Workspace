package DBtest;

import java.sql.Connection;		
import java.sql.Statement;		
import java.sql.ResultSet;		
import java.sql.DriverManager;		
import java.sql.SQLException;	

public class SQLConnector0 {				
    public static void main(String[] args) throws ClassNotFoundException, SQLException {													
        // Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3306/blood";					

        // Database Username		
        String username = "root";	
                
        // Database Password		
        String password = "";				

        // Query to Execute		
        String query = "SELECT * FROM login WHERE id = 4;";	
                
        // Load mysql jdbc driver		
        Class.forName("com.mysql.cj.jdbc.Driver");			
           
        // Create Connection to DB		
        Connection con = DriverManager.getConnection(dbUrl, username, password);
          
        // Create Statement Object		
        Statement stmt = con.createStatement();					
       
        // Execute the SQL Query. Store results in ResultSet		
        ResultSet rs = stmt.executeQuery(query);							
         
        // Check if a result is returned and print the details		
        if (rs.next()) {
            String id = rs.getString("id");								        
            String email = rs.getString("email");
            String pass = rs.getString("password");
            String phone = rs.getString("phone");
            System.out.println("ID: " + id + "  email: " + email + " password: " + pass + " phone: " + phone);		
        } else {
            System.out.println("No record found with ID = 4");
        }

        // Closing DB Connection		
        con.close();			
    }
}
