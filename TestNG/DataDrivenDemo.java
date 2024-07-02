package com.tng1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

public class DataDrivenDemo 
{
	@Test
	public static String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
			
		String filepath="E:\\Login.xlsx"; 	//only string form path
		
		File file=new File(filepath); 	//to make an file
		
		XSSFWorkbook Workbook=new XSSFWorkbook(file);	//to open the excel file
		
		Sheet sheet=Workbook.getSheet("Sheet1");	//to open the perticular sheet
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		
		data=new String[nrows][];
		for(int i=0;i<nrows;i++)//row
		{
			Row row=sheet.getRow(i);	//ith row is selection
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols: are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++) 	//cols
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");//build up path
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();	//to load the blank browser
			driver.get("https://www.saucedemo.com/");	
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Test HasBeen Passed...");
			}
			else 
				for(int i1=1;i1<=4;i1++)
			{
				System.out.println("Your Test Hasbeen Failed...");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("E:\\TAimg\\A1\\"+i1+".png");
				
				if(dest.exists())
				{
					File dest2=new File("E:\\TAimg\\A2\\"+i1+".png");
					FileUtils.copyFile(src, dest2);
				}
				
				
				FileUtils.copyFile(src, dest);
				Thread.sleep(1500);
				Assert.fail("Incorrect Uname or Psw...");
			}
			
			Thread.sleep(2000);
			System.out.println("Tataa...");
			driver.close();
		}
	}
}
