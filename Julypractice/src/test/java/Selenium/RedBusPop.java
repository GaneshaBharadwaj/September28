package Selenium;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusPop {
private static WebDriver o=null;
	public static void main(String[] args) {
		workon();

	}
	public static void workon()
	{
		try
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			o=new ChromeDriver(option);
			
		
			
			o.get("https://www.redbus.in/");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
