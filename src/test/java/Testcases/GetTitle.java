package Testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//WAP to change the size of browsers.....
//...............................//

public class GetTitle
{
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver dr = new ChromeDriver();
	dr.get("https://facebook.com");
	String str = dr.getTitle();
	System.out.println("The webpage title is: "+str);
	
	//setSize() used to change the size of browser...
	Dimension d = new Dimension(500,500);
	dr.manage().window().setSize(d);
	Thread.sleep(500);
	
	//Maximize() used to maximize the browser...we cant minimize browser...
	dr.manage().window().maximize();
	Thread.sleep(500);
	
	//setPosition() used to change the position of a browser Web page.
	Point p = new Point(400,400);
	dr.manage().window().setPosition(p);
	Thread.sleep(500);
	
	dr.close();
		
}
}
