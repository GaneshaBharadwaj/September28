package Selenium;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class POPSs {
private static WebDriver o=null;
	public static void main(String[] args) {
		workon();

	}
	public static void workon()
	{
		try
		{
			//Syntax: https://username:password@url
			o=new ChromeDriver();
			o.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
