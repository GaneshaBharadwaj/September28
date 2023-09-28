package PracticeBDD.Julypractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCookies {
	private static WebDriver driver= null;
	@Test
	public static  void GetCookie()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Set<Cookie> coockies=driver.manage().getCookies();
		System.out.println(coockies.size());
		for(Cookie A:coockies)
		{
			System.out.println(A.getName()+"     "+ A.getValue());
		}
		System.out.println("**********************************************************");
		Cookie cook=new Cookie("MyName","Ganesh");
		driver.manage().addCookie(cook);
		int size=driver.manage().getCookies().size();
		System.out.println(size+" ******************************************************");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		driver.manage().deleteCookieNamed("MyName");
		System.out.println("Simply deleted");
		driver.manage().deleteAllCookies();
	}

}
