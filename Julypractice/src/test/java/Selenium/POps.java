package Selenium;
import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class POps {
private static WebDriver o=null;
	public static void main(String[] args) {
		
		workon();
	}
	public static void workon()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://the-internet.herokuapp.com/javascript_alerts");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
			o.switchTo().alert().accept();
			Thread.sleep(5000);
			o.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
			o.switchTo().alert().dismiss();
			Thread.sleep(5000);
			o.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
			Alert a=o.switchTo().alert();
			Thread.sleep(2000);
			a.sendKeys("Hello");
			a.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
