package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataDeletionMultiRecord
{
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
            String query = "DELETE FROM login WHERE id IN (7, 8)";
            int result = stmt.executeUpdate(query);

            if (result > 0) {
                con.commit(); // Commit transaction
                System.out.println("Records deleted successfully");
            } else {
                con.rollback(); // Rollback transaction
                System.out.println("Failed to delete records");
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