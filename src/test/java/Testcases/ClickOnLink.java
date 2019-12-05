package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("File:/D:/Vishal_Automation/Selenium_Proj/login_page.html");
		Thread.sleep(1000);

		By by = By.tagName("a");
		WebElement rv = dr.findElement(by);
		rv.click();
		Thread.sleep(1000);

		dr.close();
		
	}

}
