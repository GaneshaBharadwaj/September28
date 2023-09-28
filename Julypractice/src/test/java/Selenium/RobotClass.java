package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	private static WebDriver o=null;
	public static void main(String[] args) {
		Robo();

	}
	public static void Robo()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.foundit.in/seeker/profile?application_source=organic&apop=online-presence");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.findElement(By.xpath("//*[@id=\'inline-resume\']")).sendKeys("C:\\Users\\USER\\Downloads\\Ganesh.pdf");
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
