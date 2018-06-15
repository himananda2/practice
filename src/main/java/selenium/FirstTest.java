package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class FirstTest {

	public static void main(String[] args) {

		// WebDriver driver = new ChromeDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://the-internet.herokuapp.com/");

		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[4]/a")).getText());

		Assert.assertEquals(driver.getTitle(), "The Internet");
	}

}
