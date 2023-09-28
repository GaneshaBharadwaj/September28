package Selenium;

import java.time.Duration;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class WindowsHandle {
	private static WebDriver o=null;

	public static void main(String[] args) {
		Handle();

	}
	private static void Handle()
	{
		try
		{
		
			o=new ChromeDriver();
			o.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String Parent=o.getWindowHandle();
			System.out.println(Parent);
			o.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			
			Set<String> TestID=o.getWindowHandles();
			/*Iterator<String> ids = TestID.iterator();
			String Parentid=ids.next();
			String Childid=ids.next();
			System.out.println("parent id"+Parentid);
			System.out.println("child id"+Childid);
			o.switchTo().window(Parentid);
			s.assertTrue(o.findElement(By.xpath("//p[.='Forgot your password? ']")).isDisplayed());
			System.out.println("yes I found");
			o.switchTo().window(Childid);
			System.out.println("yes!, i am in child Window");
			o.close();*/
			
			List<String> ids=new ArrayList<String>(TestID);
			String parent =ids.get(0);
			String child =ids.get(1);
			
			System.out.println(parent);
			System.out.println(child);
			String url=o.switchTo().window(parent).getCurrentUrl();
			System.out.println(url);
			
			
					
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
