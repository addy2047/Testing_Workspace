package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataDeletionRecord {
    public static void main(String[] args) 
    {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "DELETE FROM login WHERE id = 8";
            int result = stmt.executeUpdate(query);

            if (result > 0) 
            {
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("Failed to delete record");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

