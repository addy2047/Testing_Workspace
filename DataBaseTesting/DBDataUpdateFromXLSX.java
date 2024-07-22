package DBtest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDataUpdateFromXLSX 
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
                String username = getCellValueAsString(row.getCell(1));
                String email = getCellValueAsString(row.getCell(2));
                String password = getCellValueAsString(row.getCell(3));
                String phone = getCellValueAsString(row.getCell(4));
                String u_type = getCellValueAsString(row.getCell(5));
                
                if (isIdInDatabase(id)) {
                    updateDataInDatabase(id, username, email, password, phone, u_type);
                } else {
                    System.out.println("ID " + id + " not found in database. Skipping update.");
                }
            }
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString(); // Or format as required
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    private static boolean isIdInDatabase(int id) throws SQLException, ClassNotFoundException {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String usernameDB = "root";
        String passwordDB = "";
        String query = "SELECT COUNT(*) FROM login WHERE id = " + id;

        try (Connection con = DriverManager.getConnection(dbUrl, usernameDB, passwordDB);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }

    private static void updateDataInDatabase(int id, String username, String email, String password, String phone, String u_type) throws SQLException, ClassNotFoundException {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String usernameDB = "root";
        String passwordDB = "";

        String query = "UPDATE login SET username = '" + username + "', email = '" + email + "', password = '" + password + "', phone = '" + phone + "', u_type = '" + u_type + "' WHERE id = " + id;

        try (Connection con = DriverManager.getConnection(dbUrl, usernameDB, passwordDB);
             Statement stmt = con.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            int result = stmt.executeUpdate(query);
            if (result > 0) {
                System.out.println("Record updated successfully for ID: " + id);
            } else {
                System.out.println("Failed to update record for ID: " + id);
            }
        }
    }
}
