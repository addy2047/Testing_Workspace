package DBtest;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class XLSXDataInsertToDatabase
{
    public static void main(String[] args)
    {
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
                
                insertDataIntoDatabase(id, username, email, password, phone, u_type);
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

    private static void insertDataIntoDatabase(int id, String username, String email, String password, String phone, String u_type) throws SQLException, ClassNotFoundException {
        String dbUrl = "jdbc:mysql://localhost:3306/blood";
        String usernameDB = "root";
        String passwordDB = "";

        String query = "INSERT INTO login (id, username, email, password, phone, u_type) " +
                       "VALUES (" + id + ", '" + username + "', '" + email + "', '" + password + "', '" + phone + "', '" + u_type + "')";

        try (Connection con = DriverManager.getConnection(dbUrl, usernameDB, passwordDB);
             Statement stmt = con.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            int result = stmt.executeUpdate(query);
            if (result > 0) {
                System.out.println("Record inserted successfully for ID: " + id);
            } else {
                System.out.println("Failed to insert record for ID: " + id);
            }
        }
    }
}