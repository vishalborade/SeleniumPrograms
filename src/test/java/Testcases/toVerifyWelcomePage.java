package Testcases;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toVerifyWelcomePage {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver dr = new FirefoxDriver();
		dr.navigate().to("https://facebook.com");
		//String str = dr.getTitle();
		String str2 = dr.getCurrentUrl();
		dr.close();

		
		if(str2.equals("https://facebook.com"));
		{
			System.out.println("Pass");
		}
		
		//if(str.equals("Facebook - Log In or SignUp"));
		{
			System.out.println("Pass");
		}
	
	}
	

}
