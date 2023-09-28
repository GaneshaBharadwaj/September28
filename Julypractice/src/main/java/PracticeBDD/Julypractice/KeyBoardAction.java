package PracticeBDD.Julypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAction {
	public static WebDriver driver=null;
	@Test(enabled=false)
	public void A()

	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		driver.close();
	}
	@Test
	public void B()

	{
		driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		WebElement input_first=driver.findElement(By.xpath("//*[@id=\'inputText1\']"));
		
		WebElement output_first=driver.findElement(By.xpath("//*[@id=\'inputText2\']"));
		input_first.sendKeys("Hello Selenium");
		//Actions
		Actions act=new Actions(driver);
		//CONTROL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}
}
