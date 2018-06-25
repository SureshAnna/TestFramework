package allModules.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {
public static WebElement element;
	
	public static  WebElement RegisterLink(WebDriver driver){
		   element = driver.findElement(By.xpath("//*[contains(@href,'mercuryregister.php')]"));
	                  
	       return element;
	}
	
	public  static  WebElement FirstName(WebDriver driver){
	       element = driver.findElement(By.xpath("//input[@name='firstName']"));
	       return element;
	       ///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input
	}
	
	public   static   WebElement LastName(WebDriver driver){
	       element = driver.findElement(By.xpath("//input[@name='lastName']"));
	       return element;
	       ///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input
	}
	
	public static   WebElement UserName(WebDriver driver){
	       element = driver.findElement(By.id("email"));
	       return element;
	}
	
	public  static  WebElement Password(WebDriver driver){
	       element = driver.findElement(By.name("password"));
	       return element;
	       //dkljfdkljfldk
	} 
	
	public  static  WebElement ConfirmPassword(WebDriver driver){
	       element = driver.findElement(By.name("confirmPassword"));
	       return element;
	} 

	
	public  static WebElement SubmitButton(WebDriver driver){
		//	element = driver.findElement(By.name("register"));
	   //element = driver.findElement(By.xpath("//*[@name='register']"));
		
	    // System.out.println("Inside Submit button");
	     //element = driver.findElement(By.name("register"));
	     //element = driver.findElement(By.xpath("//*[@type='image' or @name='register']"));
	     element = driver.findElement(By.name("register"));
		//System.out.println("Submit button clicked");
		 return element;
	} 
}
