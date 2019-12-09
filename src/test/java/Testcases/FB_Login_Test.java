package Testcases;

//to Login in FaceBook...
//please check & update Id & Password
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_Login_Test 
{
public static void main(String[] args) 
{
	try
	{
	WebDriverManager.chromedriver().setup();
	WebDriver dr = new ChromeDriver();
	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String url = "https://www.facebook.com/"; 
	dr.navigate().to(url);
	dr.manage().window().maximize();
	dr.findElement(By.cssSelector("input[id='email']")).sendKeys("1234567890");
	Thread.sleep(500);
	dr.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456789");
	Thread.sleep(500);
	dr.findElement(By.id("loginbutton")).click();
	Thread.sleep(500);
	dr.quit();
	}
	catch(Exception e)
	{
		System.out.println("Exception has been handled...");
	}
	
}
	
	
}
