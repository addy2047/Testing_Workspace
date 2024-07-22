package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataInsertion2 {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, username, password);
            con.setAutoCommit(false); // Start transaction
            
            stmt = con.createStatement();
            
            String query1 = "INSERT INTO login (id, username, email, password, phone, u_type) VALUES (8, 'ADI', 'test@example.com', 'password123', '4563781290', 'donor')";
            String query2 = "INSERT INTO contact (id, name, email, message) VALUES (8, 'ADI', 'test@example.com', 'call me for blood 4563781290')";
            
            int result1 = stmt.executeUpdate(query1);
            int result2 = stmt.executeUpdate(query2);

            if (result1 > 0 && result2 > 0) {
                con.commit(); // Commit transaction
                System.out.println("Records inserted successfully");
            } else {
                con.rollback(); // Rollback transaction
                System.out.println("Failed to insert records");
            }

        } catch (ClassNotFoundException | SQLException e) {
            try {
                if (con != null) {
                    con.rollback(); // Rollback transaction on exception
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
