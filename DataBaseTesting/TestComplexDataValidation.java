package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestComplexDataValidation {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM login";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String email = rs.getString("email");
                if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                    System.out.println("Valid email: " + email);
                } else {
                    System.out.println("Invalid email: " + email);
                }
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}


