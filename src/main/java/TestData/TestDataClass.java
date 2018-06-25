package TestData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import allModules.PageObjects.RegisterPageObjects;

public class TestDataClass {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public WebDriver driver;
	
	public String fname, lname, email,  pwd,  cpwd;
	
	
	public void registerdata(String fname,String lname,String email, String pwd, String cpwd)
	 {
		try {
			//System.out.println("Inside Try Block");
			FileInputStream fis = new FileInputStream("C://TestData//RegisterData.xlsx");
	        wb = new XSSFWorkbook(fis); 
	        sheet = wb.getSheet("Sheet1");
  
		}catch (Exception e) {
		     System.out.println(e.getMessage()); } 
	         
	   int length=sheet.getLastRowNum();
	   for (int row = 1; row <= length; row++) {
		   fname=sheet.getRow(row).getCell(0).getStringCellValue();
		   lname=sheet.getRow(row).getCell(1).getStringCellValue();
		   email=sheet.getRow(row).getCell(2).getStringCellValue();
		   pwd=sheet.getRow(row).getCell(3).getStringCellValue();
		   cpwd=sheet.getRow(row).getCell(4).getStringCellValue();
		   RegisterPageObjects.SubmitButton(driver).click();
		   
		}
	return;
	 }
}

			

