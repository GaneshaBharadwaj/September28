package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launch();

	}
	public static void launch()
	{
		try
		{
			o=new ChromeDriver();
			o.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String ele=o.findElement(By.id("Email")).getAttribute("value");
			System.out.println("getAttribute"+ele);
			System.out.println("*************************************");
			o.findElement(By.id("Email")).clear();
			o.findElement(By.id("Email")).sendKeys("hello");
			String el=o.findElement(By.id("Email")).getText();
			System.out.println("getText"+el);
			System.out.println("*******************************");
			String elee=o.findElement(By.id("Email")).getTagName();
			System.out.println("getTagName"+elee);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
