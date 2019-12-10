package Testcases;

//to Login in Twitter...
//please check & update Id & Password
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter_Login_Test 
{
public static void main(String[] args) 
{
	try
	{
	WebDriverManager.chromedriver().setup();
	WebDriver dr = new ChromeDriver();
	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String url = "https://twitter.com/"; 
	dr.navigate().to(url);
	dr.manage().window().maximize();
	dr.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[2]")).click();
	dr.findElement(By.xpath("//input[@placeholder='Phone, email or username']")).sendKeys("12345678");
	Thread.sleep(500);
	dr.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']")).sendKeys("1234567");
	Thread.sleep(500);
	dr.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
	Thread.sleep(500);
	WebElement rv = dr.findElement(By.xpath("//span[@class='message-text']"));
	String msg = rv.getText();
	System.out.println(msg);
	Thread.sleep(200);
	dr.quit();

	}
	catch(Exception e)
	{
		System.out.println("Exception has been handled...");
	}

}
	
}
