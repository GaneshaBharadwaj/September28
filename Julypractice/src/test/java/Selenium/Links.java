package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
private static WebDriver o=null;
	public static void main(String[] args) {
		
		launch();
	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.findElement(By.linkText("Today's Deals")).click();
			o.findElement(By.partialLinkText("Amazon")).click();
			List<WebElement> ele=o.findElements(By.tagName("a"));
			System.out.println(ele.size());
			System.out.println("********************************");
			for(WebElement a:ele)
			{
				System.out.println(a.getText());
				System.out.println(a.getAttribute("href"));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
