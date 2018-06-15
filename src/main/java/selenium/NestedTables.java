package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\himananda\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Hreddy/Desktop/NTT.html");

		String cellValue = driver.findElement(By.xpath("/html/body/table//table/tbody/tr[2]/td[1]")).getText();
		System.out.println("Cell Value = " + cellValue);
	}

}
