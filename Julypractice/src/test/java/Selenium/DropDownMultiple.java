package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiple {
	private static WebDriver o=null;
	public static void main(String[] args) {
		WebElement one=o.findElement(By.name("subject"));
		launch(one,"B.Sc. - Chemistry");
		WebElement two=o.findElement(By.name("gender"));
		launch(two,"Male");

	}
	public static void launch(WebElement ole,String value)
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://alvascollege.com/admission-2/apply-online/");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Select select=new Select(ole);
			List<WebElement> options=select.getOptions();
			for(WebElement a:options)
			{
				if(a.getText().equals(value))
				{
					a.click();
				}
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
