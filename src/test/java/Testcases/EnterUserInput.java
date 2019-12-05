package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterUserInput {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("File:/D:/Vishal_Automation/Selenium_Proj/UserName.html");
		Thread.sleep(1000);
		By by = By.tagName("input");
		WebElement ele = dr.findElement(by);
		ele.sendKeys("Admin"); 
		Thread.sleep(1000);
		
		dr.close();
		
	}

}
