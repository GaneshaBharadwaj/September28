package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launch();

	}
	public  static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.hyrtutorials.com/p/frames-practice.html");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.switchTo().frame("frm1");
			Select ele=new Select(o.findElement(By.id("selectnav1")));
			ele.selectByVisibleText("-- Other");
			System.out.println("Selected");
			o.switchTo().defaultContent();
			o.switchTo().frame("frm2");
			o.findElement(By.id("firstName")).sendKeys("Ganesh");
			o.switchTo().defaultContent();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
