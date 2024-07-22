package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataValidationEmail {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM login WHERE email = 'k@gmail.com'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Record found with email = 'k@gmail.com'");
            } else {
                System.out.println("No record found with email = 'k@gmail.com'");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
