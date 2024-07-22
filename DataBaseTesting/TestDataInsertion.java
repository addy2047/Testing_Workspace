package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataInsertion {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "INSERT INTO login (id, username, email, password, phone, u_type) VALUES (8, 'ADI', 'test@example.com', 'password123', '4563781290', 'donor')";
            int result = stmt.executeUpdate(query);

            if (result > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Failed to insert record");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

