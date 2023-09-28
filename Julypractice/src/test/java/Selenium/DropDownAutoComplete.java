package Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownAutoComplete {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launch();

	}
	public static void  launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.twoplugs.com/newsearchserviceneed");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement ele = o.findElement(By.id("autocomplete"));
			ele.sendKeys("to");
			String text=null;
			do
			{
				ele.sendKeys(Keys.ARROW_DOWN);
				text=ele.getAttribute("value");
				if(text.equals("Toronto,ON,Canada"))
				{
					ele.sendKeys(Keys.ENTER);
				}
			}while(!text.isEmpty());
			
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
