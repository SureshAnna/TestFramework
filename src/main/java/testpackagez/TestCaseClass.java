package testpackagez;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import allModules.PageObjects.RegisterPageObjects;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestCaseClass {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;

	
	public   WebDriver  driver;
	public String fname, lname, email,  pwd,  cpwd;
	public FileInputStream fis;
	public int length;
	
	 @BeforeTest
	  public  void OpenBrowser() throws IOException {
	  System.out.println("Inside<------->Open Browser Module");
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Selenium_Training\\src\\Assignmnets\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  
	  }
	  
	 
	 @Test(enabled = true,priority=1)
	  public void Register() {
			  System.out.println("Inside<--->Register Module");
			  
			  try {
				  fis = new FileInputStream("C:\\Users\\Suresh\\Desktop\\Frame\\TestFramework\\src\\test\\java\\ExcelUtilityz\\RegisterData.xlsx");
				 // 
					  
					 
				  
				  wb = new XSSFWorkbook(fis); 
			      sheet = wb.getSheet("Sheet1");
			      length=sheet.getLastRowNum();
					  	 for (int row = 1; row <=length; row++) {
						 RegisterPageObjects.RegisterLink(driver).click();
				 
						   fname=sheet.getRow(row).getCell(0).getStringCellValue();
						   lname=sheet.getRow(row).getCell(1).getStringCellValue();
						   email=sheet.getRow(row).getCell(2).getStringCellValue();
						   pwd=sheet.getRow(row).getCell(3).getStringCellValue();
						   cpwd=sheet.getRow(row).getCell(4).getStringCellValue();
						 
						  RegisterPageObjects.FirstName(driver).sendKeys(fname);
						  RegisterPageObjects.LastName(driver).sendKeys(lname);
						  RegisterPageObjects.UserName(driver).sendKeys(email);
						  RegisterPageObjects.Password(driver).sendKeys(pwd);
						  RegisterPageObjects.ConfirmPassword(driver).sendKeys(cpwd);
						  
						  
						  //RegisterPageObjects.SubmitButton(driver).click();
						  JavascriptExecutor executor = (JavascriptExecutor)driver;
						  executor.executeScript("arguments[0].click();", RegisterPageObjects.SubmitButton(driver));
						  
					  }
			  
			  }catch (Exception e) {
				     System.out.println(e.getMessage()); } 
}
	 
	 @Test(enabled = true,priority=2)
	  public void Login() {
	  System.out.println("Login Module");
	  }
	  
	 
	 @Test(enabled = true,priority=3)
	  public void FlightSelect() {
		  System.out.println("Flight Selection Module");
	  }

	 
	 @Test(enabled = true,priority=4)
	  public void BookFlight() {
		  System.out.println("Book Flight Module no no no no no no no no");
	  }
	 
	 
	 @Test(enabled = true,priority=5)
	 public void CloseBrowser() {
		 driver.close();
		 System.out.println("Exit Module");
	  }
}
