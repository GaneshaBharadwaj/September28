package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launch();

	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("http://www.deadlinkcity.com/");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> ele=o.findElements(By.tagName("a"));
			for(WebElement a:ele)
			{
				String url=a.getAttribute("href");
				URL link=new URL(url);
				HttpURLConnection b=(HttpURLConnection) link.openConnection();
				if(b.getResponseCode()>=400)
				{
					System.out.println("broken"+url);
				}
				else
				{
					System.out.println("valid"+url);
				}
			}


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



