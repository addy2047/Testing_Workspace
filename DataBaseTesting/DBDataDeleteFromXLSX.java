package DBtest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDataDeleteFromXLSX 
{
    public static void main(String[] args) {
        String excelFilePath = "E:\\TestThisBook1.csv.xlsx"; 

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue; 
                }
                
                int id = (int) row.getCell(0).getNumericCellValue();
                deleteDataFromDatabase(id);
            }
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void deleteDataFromDatabase(int id) throws SQLException, ClassNotFoundException {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String usernameDB = "root";
        String passwordDB = "";

        String query = "DELETE FROM login WHERE id = " + id;

        try (Connection con = DriverManager.getConnection(dbUrl, usernameDB, passwordDB);
             Statement stmt = con.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            int result = stmt.executeUpdate(query);
            if (result > 0) {
                System.out.println("Record deleted successfully for ID: " + id);
            } else {
                System.out.println("Failed to delete record for ID: " + id);
            }
        }
    }
}
