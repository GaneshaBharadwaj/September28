package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
private static WebDriver o=null;
	public static void main(String[] args) {
		Tables();

	}
	public static void Tables()
	{
		try
		{
			o=new ChromeDriver();
			
			o.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> ele=o.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
			for(WebElement a:ele)
			{
				System.out.print(a.getText()+" ");
			}
			WebElement el=o.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]"));
			System.out.println(el.getText());
			System.out.println("*************************************");
			String A=o.findElement(By.xpath("//table[@id='customers']/tbody")).getText();
			System.out.println(A);
			System.out.println("********************************");
			for(int i=2;i<=6;i++)
			{
				for(int j=1;j<=3;j++)
				{
					String AA=o.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(AA+" || ");
				}
				System.out.println();
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
