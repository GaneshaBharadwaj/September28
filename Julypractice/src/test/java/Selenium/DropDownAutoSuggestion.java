package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownAutoSuggestion {
private static WebDriver o=null;
	public static void main(String[] args) {
		launch();

	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.bing.com/");
			o.manage().window().maximize();
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.findElement(By.id("sb_form_q")).sendKeys("Selenium");
			List<WebElement> ele=o.findElements(By.xpath("//div[@class='sa_as']//ul//li//span"));
			for(WebElement o:ele)
			{
				System.out.println(o.getText());
				if(o.getText().contains("tutorial"))
				{
					o.click();
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
