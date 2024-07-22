package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataUpdateRecord {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "UPDATE login SET email = 'ntr@example.com',password = '7447' WHERE id = 1";
            
            int result = stmt.executeUpdate(query);

            if (result > 0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Failed to update record");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
