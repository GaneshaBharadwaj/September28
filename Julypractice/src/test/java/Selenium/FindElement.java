package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launch();

	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://demo.nopcommerce.com/");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele=	o.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]//ul/li/a"));
		for(WebElement e:ele)
		{
			System.out.println(e.getText());
		}
		
		o.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).getTagName();
		System.out.println("**************************");
		o.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).getText();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
