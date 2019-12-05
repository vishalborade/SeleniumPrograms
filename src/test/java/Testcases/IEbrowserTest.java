package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEbrowserTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.iedriver().setup();
		WebDriver dr = new InternetExplorerDriver();
		dr.get("https://google.com");
		String str = dr.getTitle();
		System.out.println("Web page title is: "+str);
		String str2 = dr.getCurrentUrl();
		System.out.println("Current url: "+str2);
		Thread.sleep(500);
		dr.close();

	}

}
