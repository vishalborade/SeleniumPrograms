package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//WAP to enter the name and pwd 

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//this is comment
public class EnterUN_PWD
{
public static void main(String[] args) throws InterruptedException 
{
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver dr = new FirefoxDriver();
	dr.get("File:/D:/Vishal_Automation/Selenium_Proj/UserName.html");
	
	By by = By.id("UserName");
	WebElement rv = dr.findElement(by);
	rv.sendKeys("Admin");
	Thread.sleep(500);
	By by1 = By.id("Password");
	WebElement rv2 = dr.findElement(by1);
	rv2.sendKeys("Manager");
	
	Thread.sleep(500);
	
	dr.close();
	
}
}
