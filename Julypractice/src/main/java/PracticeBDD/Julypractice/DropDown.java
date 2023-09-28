package PracticeBDD.Julypractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DropDown {
	public static WebDriver driver=null;
	@Ignore
	@Test
	
	public void DropDown()
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification-");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd=	driver.findElement(By.id("ide"));
		Select select=new Select(dd);
		select.selectByVisibleText("IntelliJ IDEA");
		System.out.println("Wow!its selected");
		List<WebElement> opt=select.getOptions();
		for(WebElement A:opt)
		{
			System.out.println(A.getTagName());
		
		}
		System.out.println(opt.size());
		driver.close();

	}
	@Ignore
	@Test
	public void AutoComplete() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification-");
		driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> eles=driver.findElements(By.xpath("//div[@id='sw_as']/div/ul/li"));
		System.out.println(eles.size());
		
		for(WebElement opt:eles)
		{
			System.out.println(opt.getText());
			if(opt.getText().contains("dev"))
			{
				opt.click();
				break;
			}
		}
		driver.close();
	}
	@Test
	public void Robot() throws InterruptedException

	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification-");
		driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\USER\\Downloads \\GaneshhnCV.pdf");
		Thread.sleep(5000);
		driver.close();
	}
}
