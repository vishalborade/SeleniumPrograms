package Testcases;

import java.io.EOFException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "D://Vishal_Automation//Jar files//geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D://Vishal_Automation//Jar files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.close();
			
		//Using navigate() method
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver2 = new ChromeDriver();
		
		driver2.navigate().to("https://google.com");
		driver2.navigate().back();
		driver2.navigate().forward();
		driver2.navigate().refresh();
		String str = driver2.getTitle();
		System.out.println("The web page title is: "+str);
		String str2 = driver2.getCurrentUrl();
		System.out.println("The url of current page: "+str2);
		driver2.close();


	}

}
