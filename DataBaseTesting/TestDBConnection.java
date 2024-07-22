package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            if (con != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
