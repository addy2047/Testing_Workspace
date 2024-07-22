package DBtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VerifyOnlyInvalidDataFromCSV 
{
    public static void main(String[] args) 
    {
        String csvFile = "E:\\TestingData1.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (!data[0].equals("id")) { // Skip header
                    int id = Integer.parseInt(data[0].trim());
                    String email = data[1].trim();
                    verifyDataInDatabase(id, email);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void verifyDataInDatabase(int id, String email) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String username = "root";
        String password = "";

        String query = "SELECT email FROM login WHERE id = " + id;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String dbEmail = rs.getString("email").trim();
                if (!dbEmail.equals(email)) {
                    System.out.println("Data mismatch for ID: " + id + ". CSV email: " + email + ", DB email: " + dbEmail);
                }
            } else {
                System.out.println("No record found for ID: " + id);
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
