package DBtest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CopyDatabaseToXLSX 
{
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String usernameDB = "root";
        String passwordDB = "";
        int startId = 1; 
        int endId = 6; 
        String excelFilePath = "E:\\testBookCopiedRecord.xlsx"; 

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, usernameDB, passwordDB);
            Statement stmt = con.createStatement();
            
            // Query to fetch data between specified IDs
            String query = "SELECT * FROM login WHERE id BETWEEN " + startId + " AND " + endId;
            ResultSet rs = stmt.executeQuery(query);

            // Create an Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Database Data");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("ID");
            headerRow.createCell(1).setCellValue("Username");
            headerRow.createCell(2).setCellValue("Email");
            headerRow.createCell(3).setCellValue("Password");
            headerRow.createCell(4).setCellValue("Phone");
            headerRow.createCell(5).setCellValue("User Type");

            // Write data to Excel
            int rowNum = 1;
            while (rs.next()) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(rs.getInt("id"));
                row.createCell(1).setCellValue(rs.getString("username"));
                row.createCell(2).setCellValue(rs.getString("email"));
                row.createCell(3).setCellValue(rs.getString("password"));
                row.createCell(4).setCellValue(rs.getString("phone"));
                row.createCell(5).setCellValue(rs.getString("u_type"));
            }

            // Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
                workbook.write(fileOut);
            }

            // Close resources
            workbook.close();
            con.close();
            System.out.println("Data successfully copied to " + excelFilePath);

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
