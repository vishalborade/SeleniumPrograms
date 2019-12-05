package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//This is for fb login 
public class Fb_login
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		dr.manage().window().maximize();
		
		
		By by = By.id("email");
		WebElement rv = dr.findElement(by);
		rv.sendKeys("vishalborade@live.com");
		Thread.sleep(300);
		rv.clear();
		rv.sendKeys("7030502524");
		Thread.sleep(300);
		
		WebElement rv2 = dr.findElement(By.id("pass"));
		rv2.clear();
		rv2.sendKeys("9890582367");
		Thread.sleep(300);
		
		WebElement rv3 = dr.findElement(By.id("u_0_b"));
		rv3.click();
		Thread.sleep(1000);
	
		WebElement rv4 = dr.findElement(By.id("logoutMenu"));
		rv4.click();
		Thread.sleep(1000);
		
		dr.quit();
		
	
	
		
	}

}
