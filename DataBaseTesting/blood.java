package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class blood {
public static void main (String[] args) throws SQLException 
{

Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/blood" , "root", "") ;

if(connection.isClosed())
{
System. out. println ("We are not connected to the database");
}
else
{
System. out. println ("We have successfully connected to the database") ;
}
//Running the SQL query from the Java program

Statement statement = connection.createStatement() ;
ResultSet resultSet = statement.executeQuery("Select * from login where id-0");

while(resultSet.next()) 
{

System.out.println(resultSet.getInt("id"));
System.out.println(resultSet.getString("username"));
System.out.println(resultSet.getString("email"));
System.out.println(resultSet.getInt("password"));
System.out.println(resultSet.getString("phone"));
;

		}
	}
}


