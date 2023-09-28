package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	private static WebDriver o=null;
	public static void main(String[] args) {

		launch();
	System.out.println("Hello1");
	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement ele=o.findElement(By.id("course"));
			Select s=new Select(ele);
			List<WebElement> all = s.getOptions();
			System.out.println(all.size());
			ArrayList<String> temporary=new ArrayList<String>();
			ArrayList<String> Permanent=new ArrayList<String>();
			for(WebElement a:all) {
				String b=	a.getText();
				temporary.add(b);
				Permanent.add(b);
			}
			System.out.println(Permanent);
			System.out.println(temporary);
			System.out.println("*********************************************");
			Collections.sort(temporary);
			System.out.println("sorted ="+temporary);
			if(temporary.equals(Permanent))
			{
				System.out.println("Collection is unsorted");
			}
			else
				System.out.println("collection is sorted");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test()
	public void AutoComplete()
	{
		
	}

}
