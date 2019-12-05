package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_two_sites 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	//ChromeDriver dr = new ChromeDriver();
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver dr = new FirefoxDriver();
	dr.navigate().to("https://flipkart.com");
	String str = dr.getTitle();
	System.out.println("Web page title: "+str);
	Thread.sleep(500);
	
	dr.navigate().to("https://yatra.com");
	String str2 = dr.getCurrentUrl();
	System.out.println("current url: "+str2);
	Thread.sleep(300);
	
	dr.navigate().back();
	String str3 = dr.getTitle();
	System.out.println("Web page title: "+str3);
	dr.navigate().forward();
	Thread.sleep(300);
	dr.navigate().forward();
	dr.manage().window().maximize();
	Thread.sleep(300);
	dr.navigate().refresh();
	
	dr.close();
}
}
