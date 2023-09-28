package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapDown {
	private static WebDriver o=null;

	public static void main(String[] args) {
		
		launch();
	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.hdfc.com/");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			o.findElement(By.xpath("//*[@id=\'container-fced3837cb\']/div/div[1]/div")).click();
			List<WebElement> ele = o.findElements(By.xpath("//*[@id=\'productType\']/li"));
			System.out.println(ele.size());
			for(WebElement Oele:ele)
			{
				System.out.println(Oele.getText());
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
