package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {
	private static WebDriver o=null;

	public static void main(String[] args) {
		checkbox();
	}
	public static void checkbox()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://itera-qa.azurewebsites.net/home/automation");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> ele=o.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
			for(WebElement o:ele)
			{
				if(o.getText().contains("Monday"));
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
